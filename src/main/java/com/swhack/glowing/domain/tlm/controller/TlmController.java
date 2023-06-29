package com.swhack.glowing.domain.tlm.controller;

import com.swhack.glowing.domain.tlm.dto.response.TlmDto;
import com.swhack.glowing.domain.tlm.service.TlmService;
import com.swhack.glowing.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/tlm")
@Tag(name = "Tlm (Teaching/Learning Materials", description = "TLM API")
public class TlmController {

  private final TlmService tlmService;

  @GetMapping("")
  public ApiResponse<List<TlmDto>> getTlmList(
  ){
    return ApiResponse.OK(tlmService.getTlmList());
  }

}
