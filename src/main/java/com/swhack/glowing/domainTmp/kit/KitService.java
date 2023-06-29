package com.swhack.glowing.domainTmp.kit;

import com.swhack.glowing.domainTmp.kit.dto.GetKitInfoResponse;
import com.swhack.glowing.domainTmp.kit.repository.KitRepository;
import com.swhack.glowing.domainTmp.problem.ProblemDto;
import com.swhack.glowing.domainTmp.problem.ProblemRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KitService {

  private final KitRepository kitRepository;
  private final ProblemRepository problemRepository;

  public GetKitInfoResponse getKitInfo(
    long kitId
  ){

    Kit kit = this.kitRepository.findById(kitId).orElseThrow();
    List<ProblemDto> problemList = problemRepository.findAllByKit(kit)
      .stream()
      .map(ProblemDto::new)
      .collect(Collectors.toList());

    return GetKitInfoResponse.builder()
      .id(kit.getId())
      .title(kit.getTitle())
      .problems(problemList)
      .build();
  }

}
