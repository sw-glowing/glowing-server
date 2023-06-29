package com.swhack.glowing.domain.questionContent.service;

import com.swhack.glowing.domain.questionContent.repository.QuestionContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionContentService {

  private final QuestionContentRepository questionContentRepository;

}
