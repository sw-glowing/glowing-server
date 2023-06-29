package com.swhack.glowing.domain.tlmContent.entity;

import com.swhack.glowing.domain.tlm.entity.Tlm;
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
@Table(name = "tlmContent")
public class TlmContent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "wordId")
  private Word word;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "tlmId")
  private Tlm tlm;


  @Builder
  public TlmContent(Long id, Word word, Tlm tlm){
    this.id = id;
    this.word = word;
    this.tlm = tlm;
  }

}