package com.swhack.glowing.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiHeader {
  private int code;
  private String msg;
}
