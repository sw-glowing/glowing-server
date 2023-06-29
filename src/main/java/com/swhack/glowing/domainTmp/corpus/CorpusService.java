package com.swhack.glowing.domainTmp.corpus;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CorpusService {

  private final CorpusRepository corpusRepository;

  public Corpus getRandomCorpus(){

    List<Corpus> corpusList = this.corpusRepository.findAll()
      .stream()
      .collect(Collectors.toList());

    Collections.shuffle(corpusList);

    return corpusList.get(0);
  }

}
