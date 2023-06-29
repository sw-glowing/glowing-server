package com.swhack.glowing.domain.word.service;

import com.swhack.glowing.domain.word.entity.Word;
import com.swhack.glowing.domain.word.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WordService {

  private final WordRepository wordRepository;

  public Word getWordById(Long id) {
    Optional<Word> wordOptional = wordRepository.findById(id);
    return wordOptional.orElse(null);
  }

  public List<Word> getAllWords() {
    return wordRepository.findAll();
  }

}