package com.swhack.glowing.domain.tlm.dto.response;

import com.swhack.glowing.domain.tlm.entity.Tlm;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
public class TlmDto {

  private long id;

  private String user;

  private String school;

  private LocalDateTime createdDate;

  @Builder
  public TlmDto(
    Tlm entity
  ) {
    this.id = entity.getId();
    this.user = String.valueOf(entity.getUser().getUserRole());
    this.school = entity.getSchool().getName();
    this.createdDate = entity.getCreatedDate();
  }
}
