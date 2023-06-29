package com.swhack.glowing.domain.tlmContent.repository;

import com.swhack.glowing.domain.tlmContent.entity.TlmContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TlmContentRepository extends JpaRepository<TlmContent, Long> {
}
