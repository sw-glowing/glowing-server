package com.swhack.glowing.domain.question.entity;

import com.swhack.glowing.domain.test.entity.Test;
import javax.persistence.*;
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
@Table(name = "question")
public class Question{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "testId")
  private Test test;

  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private QuestionType questionType;

  @Builder
  public Question(Long id, Test test, QuestionType questionType){
    this.id = id;
    this.test = test;
    this.questionType = questionType;
  }

}