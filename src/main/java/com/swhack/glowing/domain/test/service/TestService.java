package com.swhack.glowing.domain.test.service;

import com.swhack.glowing.domain.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

  private final TestRepository testRepository;

}
