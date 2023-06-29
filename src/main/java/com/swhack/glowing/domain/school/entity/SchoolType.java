package com.swhack.glowing.domain.school.entity;

import java.util.Locale;

public enum SchoolType {
  ELEMENTARY,
  MIDDLE,
  HIGH;

  public static SchoolType of(String schoolType) {
    return SchoolType.valueOf(schoolType.toUpperCase(Locale.ROOT));
  }
}
