package com.ProjectEstimationApp.model;

public class ProspectDetails {
	
	private String name;
	private String region;
	private String bsgContact;
	private String pdmContact;
	private String tfocusID;
	private String cemTeam;
	
	
	public ProspectDetails() {
		super();
	}
	public ProspectDetails(String name, String region, String bsgContact, String pdmContact, String tfocusID,
			String cemTeam) {
		super();
		this.name = name;
		this.region = region;
		this.bsgContact = bsgContact;
		this.pdmContact = pdmContact;
		this.tfocusID = tfocusID;
		this.cemTeam = cemTeam;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBsgContact() {
		return bsgContact;
	}
	public void setBsgContact(String bsgContact) {
		this.bsgContact = bsgContact;
	}
	public String getPdmContact() {
		return pdmContact;
	}
	public void setPdmContact(String pdmContact) {
		this.pdmContact = pdmContact;
	}
	public String getTfocusID() {
		return tfocusID;
	}
	public void setTfocusID(String tfocusID) {
		this.tfocusID = tfocusID;
	}
	public String getCemTeam() {
		return cemTeam;
	}
	public void setCemTeam(String cemTeam) {
		this.cemTeam = cemTeam;
	}

	
}
