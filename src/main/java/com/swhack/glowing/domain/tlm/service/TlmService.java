package com.swhack.glowing.domain.tlm.service;

import com.swhack.glowing.domain.tlm.dto.response.TlmDto;
import com.swhack.glowing.domain.tlm.entity.Tlm;
import com.swhack.glowing.domain.tlm.repository.TlmRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TlmService {

  private final TlmRepository tlmRepository;

  public List<TlmDto> getTlmList(
  ) {

    List<TlmDto> List = tlmRepository.findAll()
      .stream().map(TlmDto::new)
      .collect(Collectors.toList());;

    return List;
  }
}
