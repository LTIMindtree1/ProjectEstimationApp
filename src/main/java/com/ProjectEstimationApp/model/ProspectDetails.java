package com.ProjectEstimationApp.model;

public class ProspectDetails {
    private String Name;
    private String Region;
    private String BSGContact;
    private String PDMContact;
    private String TfocusId;
    private String CEMTeam;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getBSGContact() {
        return BSGContact;
    }

    public void setBSGContact(String BSGContact) {
        this.BSGContact = BSGContact;
    }

    public String getPDMContact() {
        return PDMContact;
    }

    public void setPDMContact(String PDMContact) {
        this.PDMContact = PDMContact;
    }

    public String getTfocusId() {
        return TfocusId;
    }

    public void setTfocusId(String tfocusId) {
        TfocusId = tfocusId;
    }

    public String getCEMTeam() {
        return CEMTeam;
    }

    public void setCEMTeam(String CEMTeam) {
        this.CEMTeam = CEMTeam;
    }

    @Override
    public String toString() {
        return "ProspectDetails{" +
                "Name='" + Name + '\'' +
                ", Region='" + Region + '\'' +
                ", BSGContact='" + BSGContact + '\'' +
                ", PDMContact='" + PDMContact + '\'' +
                ", TfocusId='" + TfocusId + '\'' +
                ", CEMTeam='" + CEMTeam + '\'' +
                '}';
    }
}
