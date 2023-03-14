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
@Setter
@Getter
@Table(name = "submodulelist")
public class SubModuleList {
    @Id
    private Long submoduleId;
    private String submoduleName;
    private String productMapping;
    private String channel;


}
