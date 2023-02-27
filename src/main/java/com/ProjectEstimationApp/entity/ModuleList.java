package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "modulelist")
public class ModuleList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long moduleId;
    private String moduleName;

    @OneToMany(targetEntity = SubModuleList.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "modId",referencedColumnName = "moduleId")
    private List<SubModuleList> submodule;

}
