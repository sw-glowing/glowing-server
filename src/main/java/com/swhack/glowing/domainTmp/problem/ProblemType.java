package com.swhack.glowing.domainTmp.problem;

import java.util.Locale;

public enum ProblemType {
  BLANK,
  REORDER;

  public static ProblemType of(String problemType) {
    return ProblemType.valueOf(problemType.toUpperCase(Locale.ROOT));
  }
}
