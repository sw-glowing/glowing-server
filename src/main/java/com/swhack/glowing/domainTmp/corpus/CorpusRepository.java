package com.swhack.glowing.domainTmp.corpus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorpusRepository extends JpaRepository<Corpus, Long>{
}
