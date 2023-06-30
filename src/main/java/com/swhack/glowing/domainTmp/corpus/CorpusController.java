package com.swhack.glowing.domainTmp.corpus;

import com.swhack.glowing.domainTmp.corpus.dto.CreateCorpusRequest;
import com.swhack.glowing.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/corpus")
@Tag(name = "Corpus", description = "Corpus API")
public class CorpusController {

  private final CorpusService corpusService;

  @GetMapping("")
  @Operation(summary = "모든 단어 조회 API", description = "")
  public ApiResponse<List<Corpus>> getCorpusList(
  ) {
    return ApiResponse.OK(this.corpusService.getCorpusList());
  }

  @GetMapping("/random")
  @Operation(summary = "단어 랜덤 조회 API", description = "")
  public ApiResponse<Corpus> getRandomCorpus(
  ) {
    return ApiResponse.OK(this.corpusService.getRandomCorpus());
  }

  @PostMapping("")
  @Operation(summary = "단어 생성 API", description = "")
  public ApiResponse<Corpus> createCorpus(
    @Valid
    @RequestBody
    CreateCorpusRequest request
  ) {
    return ApiResponse.OK(this.corpusService.createCorpus(request));
  }

  @DeleteMapping("/{corpusId}")
  @Operation(summary = "단어 삭제 API", description = "")
  public ApiResponse<String> createCorpus(
    @PathVariable long corpusId
  ) {
    return ApiResponse.OK(this.corpusService.deleteCorpus(corpusId));
  }
}
