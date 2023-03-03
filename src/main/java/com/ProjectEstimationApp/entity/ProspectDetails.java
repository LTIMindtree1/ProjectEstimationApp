package com.ProjectEstimationApp.entity;

import java.util.Arrays;

public class ProspectDetails {

	private String name;
	private String region;
	private String bsgContact;
	private String pdmContact;
	private String tfocusID;
	private String cemTeam;

	private String[] channel;
	private String languageLTR;
	private String languageRTL;
	private String transact;
	
	private String[] product;

	public ProspectDetails() {
		super();
	}

	

	public ProspectDetails(String name, String region, String bsgContact, String pdmContact, String tfocusID,
			String cemTeam, String[] channel, String languageLTR, String languageRTL, String transact,
			String[] product) {
		super();
		this.name = name;
		this.region = region;
		this.bsgContact = bsgContact;
		this.pdmContact = pdmContact;
		this.tfocusID = tfocusID;
		this.cemTeam = cemTeam;
		this.channel = channel;
		this.languageLTR = languageLTR;
		this.languageRTL = languageRTL;
		this.transact = transact;
		this.product = product;
	}



	public String[] getChannel() {
		return channel;
	}

	public void setChannel(String[] channel) {
		this.channel = channel;
	}

	public String getLanguageLTR() {
		return languageLTR;
	}

	public void setLanguageLTR(String languageLTR) {
		this.languageLTR = languageLTR;
	}

	public String getLanguageRTL() {
		return languageRTL;
	}

	public void setLanguageRTL(String languageRTL) {
		this.languageRTL = languageRTL;
	}

	public String getTransact() {
		return transact;
	}

	public void setTransact(String transact) {
		this.transact = transact;
	}
	public String[] getProduct() {
		return product;
	}

	public void setProduct(String[] product) {
		this.product = product;
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



	@Override
	public String toString() {
		return "ProspectDetails [name=" + name + ", region=" + region + ", bsgContact=" + bsgContact + ", pdmContact="
				+ pdmContact + ", tfocusID=" + tfocusID + ", cemTeam=" + cemTeam + ", channel="
				+ Arrays.toString(channel) + ", languageLTR=" + languageLTR + ", languageRTL=" + languageRTL
				+ ", transact=" + transact + ", product=" + Arrays.toString(product) + "]";
	}

}
