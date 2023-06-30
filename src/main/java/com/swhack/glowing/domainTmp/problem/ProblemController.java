package com.swhack.glowing.domainTmp.problem;

import com.swhack.glowing.domainTmp.kit.Kit;
import com.swhack.glowing.domainTmp.problem.dto.CheckProblemAnswerRequest;
import com.swhack.glowing.domainTmp.problem.dto.CheckProblemAnswerResponse;
import com.swhack.glowing.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/problem")
@Tag(name = "Problem", description = "Problem API")
public class ProblemController {

  private final ProblemService problemService;

  @PostMapping("/{problemId}")
  @Operation(summary = "문제 정답 확인 API", description = "")
  public ApiResponse<CheckProblemAnswerResponse> checkProblemAnswer(
    @PathVariable long problemId,
    @Valid @RequestBody CheckProblemAnswerRequest request
  ) {
    return ApiResponse.OK(this.problemService.checkProblemAnswer(problemId, request));
  }

}
