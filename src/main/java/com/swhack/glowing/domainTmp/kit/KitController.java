package com.swhack.glowing.domainTmp.kit;

import com.swhack.glowing.domainTmp.kit.dto.GetKitInfoResponse;
import com.swhack.glowing.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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

  @GetMapping("/{kitId}")
  @Operation(summary = "문제 키트 정보 API", description = "")
  public ApiResponse<GetKitInfoResponse> getKitInfo(
    @RequestParam long kitId
  ) {
    return ApiResponse.OK(this.kitService.getKitInfo(kitId));
  }
}
