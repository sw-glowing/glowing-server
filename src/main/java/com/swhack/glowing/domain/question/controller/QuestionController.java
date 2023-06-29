package com.swhack.glowing.domain.question.controller;

import com.swhack.glowing.domain.question.service.QuestionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/question")
@Tag(name = "Question", description = "질문 API")
public class QuestionController {

  private final QuestionService questionService;

}
