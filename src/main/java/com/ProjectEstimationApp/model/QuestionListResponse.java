package com.ProjectEstimationApp.model;

public class QuestionListResponse {
    private String questionName;
    private String questionType;
    private String questionCategory;

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

    @Override
    public String toString() {
        return "QuestionListResponse{" +
                "questionName='" + questionName + '\'' +
                ", questionType='" + questionType + '\'' +
                ", questionCategory='" + questionCategory + '\'' +
                '}';
    }
}
