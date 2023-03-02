package com.ProjectEstimationApp.model;

public class AssumptionsList {
	private int id;
	private String category;
	private String assumption;
	private String type;
	
	
	
	public AssumptionsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssumptionsList(int id, String category, String assumption, String type) {
		super();
		this.id = id;
		this.category = category;
		this.assumption = assumption;
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
	public String getAssumption() {
		return assumption;
	}
	public void setAssumption(String assumption) {
		this.assumption = assumption;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
}
