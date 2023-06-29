package com.swhack.glowing.domain.word.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "word")
public class Word {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @NotNull
  @Column(name = "word")
  private String word;

  @NotNull
  @Column(name = "definition")
  private String definition;

  @Column(name = "synonym")
  private String synonym;

  @Builder
  public Word(Long id, String word, String definition, String synonym){
    this.id = id;
    this.word = word;
    this.definition = definition;
    this.synonym = synonym;
  }

}