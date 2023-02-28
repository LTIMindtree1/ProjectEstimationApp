package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "riskmatigationlist")
public class RiskMatigationList {
    @Id
    private Long matigationId;
    private String rId;
    private String matigationName;
}
