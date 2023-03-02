package com.ProjectEstimationApp.repository;

import com.ProjectEstimationApp.entity.QuestionList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionList, Long> {
}
