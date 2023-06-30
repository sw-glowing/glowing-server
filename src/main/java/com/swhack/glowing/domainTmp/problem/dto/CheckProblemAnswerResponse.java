package com.swhack.glowing.domainTmp.problem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Schema(description = "문제 제출 결과")
@Getter
@NoArgsConstructor
public class CheckProblemAnswerResponse {
  private Boolean result;
  private Integer cnt;
  private Double correctRate;

  @Builder
  public CheckProblemAnswerResponse(Boolean result, Integer cnt, Double correctRate) {
    this.result = result;
    this.cnt = cnt;
    this.correctRate = correctRate;
  }
}
