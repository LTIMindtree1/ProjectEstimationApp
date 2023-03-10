package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "assumptionlist")
public class AssumptionList {
    @Id
    private String assumptionsId;
    private String assumptionsCategory;
    private String assumptionsName;
    private String assumptionsType;

}
