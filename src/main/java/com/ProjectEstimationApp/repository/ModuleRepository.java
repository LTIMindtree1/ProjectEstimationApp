package com.ProjectEstimationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ProjectEstimationApp.entity.ModuleList;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModuleRepository extends JpaRepository<ModuleList, Long> {

    @Query("select m from ModuleList m")
    public List<ModuleList> getModule();
}
