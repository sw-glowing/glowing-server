package com.swhack.glowing.domainTmp.corpus;

import com.swhack.glowing.domainTmp.corpus.dto.CreateCorpusRequest;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CorpusService {

  private final CorpusRepository corpusRepository;

  public List<Corpus> getCorpusList(){

    List<Corpus> corpusList = this.corpusRepository.findAll()
      .stream()
      .collect(Collectors.toList());

    return corpusList;
  }

  public Corpus getRandomCorpus(){

    List<Corpus> corpusList = this.corpusRepository.findAll()
      .stream()
      .collect(Collectors.toList());

    Collections.shuffle(corpusList);

    return corpusList.get(0);
  }

  @Transactional
  public Corpus createCorpus(
    CreateCorpusRequest request
  ){
    return corpusRepository.save(Corpus.builder().content(request.getContent()).definition(request.getDefinition()).build());
  }

  @Transactional
  public String deleteCorpus(
    long corpusId
  ) {

    Corpus corpus = corpusRepository.findById(corpusId)
      .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 단어ID입니다."));

    corpusRepository.delete(corpus);

    return "Corpus Deleted";
  }

}
