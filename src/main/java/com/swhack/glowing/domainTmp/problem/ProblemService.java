package com.swhack.glowing.domainTmp.problem;

import com.swhack.glowing.domainTmp.kit.Kit;
import com.swhack.glowing.domainTmp.kit.dto.GetKitInfoResponse;
import com.swhack.glowing.domainTmp.kit.repository.KitRepository;
import com.swhack.glowing.domainTmp.problem.dto.CheckProblemAnswerRequest;
import com.swhack.glowing.domainTmp.problem.dto.CheckProblemAnswerResponse;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProblemService {

  private final KitRepository kitRepository;
  private final ProblemRepository problemRepository;

  public CheckProblemAnswerResponse checkProblemAnswer(
    long problemId,
    CheckProblemAnswerRequest request
  ){

    Boolean status = Boolean.FALSE;

    Problem problem = this.problemRepository.findById(problemId).orElseThrow();

    if (problem.getSentence().equals(request.getAnswer())) {
      status = Boolean.TRUE;
    }

    Double rate = ((problem.getCnt()*problem.getCorrectRate())+ BooleanUtils.toInteger(status))/(problem.getCnt()+1);
    Integer newcnt = problem.getCnt()+1;

    problem.updateProblemInfo(newcnt, rate);

    return CheckProblemAnswerResponse.builder().result(status).cnt(newcnt).correctRate(rate).build();
  }

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
