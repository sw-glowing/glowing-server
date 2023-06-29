package com.swhack.glowing.domain.user.controller;

import com.swhack.glowing.domain.user.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/web/user")
@Tag(name = "User", description = "사용자 API")
public class UserController {

  private final UserService userService;

}
