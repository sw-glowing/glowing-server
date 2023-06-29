package com.swhack.glowing.domainTmp.problem;

import com.swhack.glowing.domainTmp.kit.Kit;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Long>{
  List<Problem> findAllByKit(Kit kit);
}
