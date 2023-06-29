package com.swhack.glowing.domainTmp.kit.repository;

import com.swhack.glowing.domainTmp.kit.Kit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitRepository extends JpaRepository<Kit, Long> {

}
