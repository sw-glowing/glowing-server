package com.swhack.glowing.domainTmp.problem;

import java.util.Locale;

public enum ProblemType {
  BLANK,
  ORDER;

  public static ProblemType of(String problemType) {
    return ProblemType.valueOf(problemType.toUpperCase(Locale.ROOT));
  }
}
