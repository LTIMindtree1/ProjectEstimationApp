package com.ProjectEstimationApp.model;

public class QuestionsCollection {
	private int id;
	private String category;
	private String question;
	private String type;
	
	
	
	public QuestionsCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public QuestionsCollection(int id, String category, String question, String type) {
		super();
		this.id = id;
		this.category = category;
		this.question = question;
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
}
