package com.swhack.glowing.domainTmp.kit;

import com.swhack.glowing.domainTmp.corpus.Corpus;
import com.swhack.glowing.domainTmp.kit.dto.GetKitInfoResponse;
import com.swhack.glowing.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/kit")
@Tag(name = "Problem Kit", description = "Problem Kit API")
public class KitController {

  private final KitService kitService;

  @GetMapping("")
  @Operation(summary = "모든 키트 목록 조회 API", description = "")
  public ApiResponse<List<Kit>> getCorpusList(
  ) {
    return ApiResponse.OK(this.kitService.getKitList());
  }

  @GetMapping("/{kitId}")
  @Operation(summary = "키트 정보 API", description = "")
  public ApiResponse<GetKitInfoResponse> getKitInfo(
    @RequestParam long kitId
  ) {
    return ApiResponse.OK(this.kitService.getKitInfo(kitId));
  }
}
