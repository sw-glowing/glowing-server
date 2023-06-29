package com.swhack.glowing.domain.word.service;

import com.swhack.glowing.domain.word.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WordService {

  private final WordRepository wordRepository;

}
