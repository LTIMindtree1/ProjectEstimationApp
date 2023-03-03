package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data


@Table(name = "questionlist")
public class QuestionList {
   
	@Id
    private Long questionId;
    private String questionCategory;
    private String questionName;
    private String questionType;
    
    
    
    
    
	public QuestionList(Long questionId, String questionCategory, String questionName, String questionType) {
		super();
		this.questionId = questionId;
		this.questionCategory = questionCategory;
		this.questionName = questionName;
		this.questionType = questionType;
	}
	public QuestionList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestionCategory() {
		return questionCategory;
	}
	public void setQuestionCategory(String questionCategory) {
		this.questionCategory = questionCategory;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
    
}
