package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Table(name = "submodulelist")
public class SubModuleList {
    @Id
    @GeneratedValue
    private Long submoduleId;
    private Long moduleId;
    private String submoduleName;
    private String productMapping;
}
