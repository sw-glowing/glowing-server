package com.swhack.glowing.domain.test.controller;

import com.swhack.glowing.domain.test.service.TestService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/test")
@Tag(name = "Test", description = "Test API")
public class TestController {

  private final TestService testService;

}
