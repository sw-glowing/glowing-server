package com.swhack.glowing.domain.questionContent.repository;

import com.swhack.glowing.domain.questionContent.entity.QuestionContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionContentRepository extends JpaRepository<QuestionContent, Long> {
}
