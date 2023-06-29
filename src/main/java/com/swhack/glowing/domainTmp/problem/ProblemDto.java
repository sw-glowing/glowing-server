package com.swhack.glowing.domainTmp.problem;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Arrays;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Schema(description = "문제 정보")
@Getter
@NoArgsConstructor
public class ProblemDto {
  @Schema(description = "문제 ID")
  private long id;

  @Schema(description = "문장")
  private String sentence;

  @Schema(description = "문제 유형")
  private ProblemType type;

  @Schema(description = "가짜 선택지")
  private List<String> trap;

  @Builder
  public ProblemDto(
    Problem entity
  ) {
    this.id = entity.getId();
    this.sentence = entity.getSentence();
    this.type = entity.getProblemType();
    this.trap = this.getTrap();
  }
}
