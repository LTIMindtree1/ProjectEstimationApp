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
@Table(name = "questionlist")
public class QuestionList {
    @Id
    private Long questionId;
    private String questionName;
    private String questionType;
}
