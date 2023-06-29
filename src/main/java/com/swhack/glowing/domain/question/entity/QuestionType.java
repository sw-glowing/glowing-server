package com.swhack.glowing.domain.question.entity;

import java.util.Locale;

public enum QuestionType {
  BLANK,
  REORDER;

  public static QuestionType of(String questionType) {
    return QuestionType.valueOf(questionType.toUpperCase(Locale.ROOT));
  }
}
