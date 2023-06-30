package com.swhack.glowing.domainTmp.problem;

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
  @Column(name = "sentence")
  private String sentence;

  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private ProblemType problemType;

  @NotNull
  @Column(name = "traps")
  private String traps;

  @NotNull
  @Column(name = "cnt")
  private Integer cnt;

  @NotNull
  @Column(name = "correctRate")
  private Double correctRate;

  @Builder
  public Problem(Long id, Kit kit, String sentence, ProblemType problemType, String traps, Integer cnt, Double correctRate){
    this.id = id;
    this.kit = kit;
    this.sentence = sentence;
    this.problemType = problemType;
    this.traps = traps;
    this.cnt = cnt;
    this.correctRate = correctRate;
  }

  public void updateProblemInfo(Integer cnt, Double correctRate){
    this.cnt = cnt;
    this.correctRate = correctRate;
  }

}
