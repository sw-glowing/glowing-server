package com.swhack.glowing.domain.tlmContent.controller;

import com.swhack.glowing.domain.tlmContent.service.TlmContentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/tlm-content")
@Tag(name = "Tlm Content", description = "TLM Content API")
public class TlmContentController {

  private final TlmContentService tlmContentService;

}
