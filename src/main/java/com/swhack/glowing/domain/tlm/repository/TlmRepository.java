package com.swhack.glowing.domain.tlm.repository;

import com.swhack.glowing.domain.tlm.entity.Tlm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TlmRepository extends JpaRepository<Tlm, Long> {

}
