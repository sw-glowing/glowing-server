package com.swhack.glowing.domainTmp.kit.dto;

import com.swhack.glowing.domainTmp.problem.ProblemDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Schema(description = "문제 키트 정보")
@Getter
@NoArgsConstructor
public class GetKitInfoResponse {
  @Schema(description = "키트 ID")
  private long id;

  @Schema(description = "키트 제목")
  private String title;

  @Schema(description = "문제 목록")
  private List<ProblemDto> problems;

  @Builder
  public GetKitInfoResponse(long id, String title, List<ProblemDto> problems) {
    this.id = id;
    this.title = title;
    this.problems = problems;
  }
}
