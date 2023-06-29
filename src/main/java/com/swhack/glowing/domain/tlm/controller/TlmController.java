package com.swhack.glowing.domain.tlm.controller;

import com.swhack.glowing.domain.tlm.service.TlmService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/tlm")
@Tag(name = "Tlm (Teaching/Learning Materials", description = "TLM API")
public class TlmController {

  private final TlmService tlmService;

}
