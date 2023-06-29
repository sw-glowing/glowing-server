package com.swhack.glowing.domainTmp.corpus;

import com.swhack.glowing.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/kit")
@Tag(name = "Problem Kit", description = "Problem Kit API")
public class CorpusController {

  private final CorpusService corpusService;

  @GetMapping("")
  @Operation(summary = "단어 랜덤 조회 API", description = "")
  public ApiResponse<Corpus> getRandomCorpus(
  ) {

    return ApiResponse.OK(this.corpusService.getRandomCorpus());
  }
}
