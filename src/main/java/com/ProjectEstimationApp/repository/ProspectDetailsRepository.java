package com.ProjectEstimationApp.repository;

import com.ProjectEstimationApp.entity.ProspectDetailsEntity;
import com.ProjectEstimationApp.model.ProspectDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProspectDetailsRepository extends JpaRepository<ProspectDetailsEntity, Long> {
}
