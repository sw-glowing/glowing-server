package com.swhack.glowing.domainTmp.corpus.dto;

import com.swhack.glowing.domainTmp.corpus.Corpus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Schema(description = "이야기 생성 요청")
@Getter
@NoArgsConstructor
public class CreateCorpusRequest {
  private String content;
  private String definition;

  @Builder
  public CreateCorpusRequest(String content, String definition){
    this.content = content;
    this.definition = definition;
  }

  public Corpus toEntity() {
    return Corpus.builder()
      .content(content)
      .definition(definition)
      .build();
  }
}
