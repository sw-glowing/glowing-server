package com.swhack.glowing.domain.tlm.service;

import com.swhack.glowing.domain.tlm.repository.TlmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TlmService {

  private final TlmRepository tlmRepository;

}
