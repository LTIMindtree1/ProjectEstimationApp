package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "submodulelist")
public class SubModuleList {
    @Id
    @GeneratedValue
    private Long submoduleId;
    private Long moduleId;
    private String submoduleName;
    private String productMapping;
}
