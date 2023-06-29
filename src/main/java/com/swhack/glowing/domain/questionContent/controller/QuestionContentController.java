package com.swhack.glowing.domain.questionContent.controller;

import com.swhack.glowing.domain.questionContent.service.QuestionContentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/question-content")
@Tag(name = "Question Content", description = "질문 내용 API")
public class QuestionContentController {

  private final QuestionContentService questionContentService;

}
