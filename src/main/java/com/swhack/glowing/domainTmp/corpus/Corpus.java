package com.swhack.glowing.domainTmp.corpus;

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

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "corpus")
public class Corpus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @NotNull
  @Column(name = "content")
  private String content;

  @NotNull
  @Column(name = "definition")
  private String definition;

  @Column(name = "synonym")
  private String synonym;

  @Builder
  public Corpus(Long id, String content, String definition, String synonym){
    this.id = id;
    this.content = content;
    this.definition = definition;
    this.synonym = synonym;
  }

}