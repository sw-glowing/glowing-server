package com.swhack.glowing.domainTmp.problem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Schema(description = "문제 제출 내용")
@Getter
@NoArgsConstructor
public class CheckProblemAnswerRequest {
  private String answer;

  @Builder
  public CheckProblemAnswerRequest(String answer) {
    this.answer = answer;
  }
}
