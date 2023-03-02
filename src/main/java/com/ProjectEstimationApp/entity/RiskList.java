package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "risklist")
public class RiskList {
    @Id
    private Long riskId;
    private String riskCategory;
    private String riskName;

    @OneToMany(targetEntity = RiskMatigationList.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rId",referencedColumnName = "riskId")
    private List<RiskMatigationList> matigation;
}
