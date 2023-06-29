package com.swhack.glowing.domain.tlmContent.service;

import com.swhack.glowing.domain.tlmContent.repository.TlmContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TlmContentService {

  private final TlmContentRepository tlmContentRepository;

}
