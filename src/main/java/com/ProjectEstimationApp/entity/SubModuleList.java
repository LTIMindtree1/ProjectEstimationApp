package com.ProjectEstimationApp.entity;

import lombok.*;

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
