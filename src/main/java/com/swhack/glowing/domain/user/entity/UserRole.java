package com.swhack.glowing.domain.user.entity;

import java.util.Locale;

public enum UserRole {
  STUDENT,
  TEACHER;

  public static UserRole of(String userRole) {
    return UserRole.valueOf(userRole.toUpperCase(Locale.ROOT));
  }
}
