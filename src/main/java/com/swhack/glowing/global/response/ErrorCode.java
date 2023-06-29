package com.swhack.glowing.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
  FAIL(999,"실패"),
  NOT_FOUND_USER(100, "NOT_FOUND_USER");

  private int code;
  private String msg;
}