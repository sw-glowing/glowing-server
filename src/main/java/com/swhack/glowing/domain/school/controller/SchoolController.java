package com.swhack.glowing.domain.school.controller;

import com.swhack.glowing.domain.school.service.SchoolService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/school")
@Tag(name = "School", description = "학교 API")
public class SchoolController {

  private final SchoolService schoolService;

}
