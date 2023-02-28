package com.ProjectEstimationApp.repository;

import com.ProjectEstimationApp.entity.RiskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskRepository extends JpaRepository<RiskList, Long> {
}
