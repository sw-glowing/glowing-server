package com.swhack.glowing.domain.questionContent.entity;

import com.swhack.glowing.domain.question.entity.Question;
import com.swhack.glowing.domain.word.entity.Word;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "questionContent")
public class QuestionContent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "questionId")
  private Question question;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "wordId")
  private Word word;

  @NotNull
  @Column(name = "corpus")
  private String corpus;

  @NotNull
  @Column(name = "stx")
  private Integer stx;

  @NotNull
  @Column(name = "selectionRate")
  private Double selectionRate;

  @Builder
  public QuestionContent(Long id, Question question, Word word, String corpus, Integer stx, Double selectionRate){
    this.id = id;
    this.question = question;
    this.word = word;
    this.corpus = corpus;
    this.stx = stx;
    this.selectionRate = selectionRate;
  }

}