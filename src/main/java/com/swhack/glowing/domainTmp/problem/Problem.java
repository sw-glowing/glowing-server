package com.swhack.glowing.domainTmp.problem;

import com.swhack.glowing.domainTmp.corpus.Corpus;
import com.swhack.glowing.domainTmp.kit.Kit;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "problem")
public class Problem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "kitId")
  private Kit kit;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "corpusId")
  private Corpus corpus;

  @NotNull
  @Column(name = "sentence")
  private String sentence;

  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private ProblemType problemType;

  @Builder
  public Problem(Long id, Kit kit, Corpus corpus, String sentence, ProblemType problemType){
    this.id = id;
    this.kit = kit;
    this.corpus = corpus;
    this.sentence = sentence;
    this.problemType = problemType;
  }

}