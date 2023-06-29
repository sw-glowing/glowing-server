package com.swhack.glowing.domain.word.controller;

import com.swhack.glowing.domain.word.entity.Word;
import com.swhack.glowing.domain.word.service.WordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/word")
@Tag(name = "Word", description = "학습 도구어 API")
public class WordController {

  private final WordService wordService;

  @GetMapping
  public List<Word> getAllWords() {
    return wordService.getAllWords();
  }

}