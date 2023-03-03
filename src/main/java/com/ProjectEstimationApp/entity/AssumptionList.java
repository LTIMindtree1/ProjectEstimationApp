package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "assumptionlist")
public class AssumptionList {
    @Id
    private Long assumptionsId;
    private String assumptionsCategory;
    private String assumptionsName;
    private String assumptionsType;

}
