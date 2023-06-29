package com.swhack.glowing.global.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiResponse<T>{
  private ApiHeader header;
  private T body;

  private static int SUCCESS = 200;

  public ApiResponse(ApiHeader header, T body){
    this.header = header;
    this.body = body;
  }

  public ApiResponse(ApiHeader header) {
    this.header = header;
  }

  public static <T> ApiResponse<T> OK(T data) {
    return new ApiResponse<T>(new ApiHeader(SUCCESS, "SUCCESS"), data);
  }

  public static <T> ApiResponse<T> FAIL(ErrorCode errorCode){
    return new ApiResponse<T>(new ApiHeader(errorCode.getCode(), errorCode.getMsg()), null);
  }
}