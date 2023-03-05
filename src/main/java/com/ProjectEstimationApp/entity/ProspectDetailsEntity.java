package com.ProjectEstimationApp.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prospectdetailslist")
public class ProspectDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prospectId;
    private String Name;
    private String Region;
    private String BSGContact;
    private String PDMContact;
    private String TfocusId;
    private String CEMTeam;

    public Long getProspectId() {
        return prospectId;
    }

    public void setProspectId(Long prospectId) {
        this.prospectId = prospectId;
    }

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
        return "ProspectDetailsEntity{" +
                "prospectId=" + prospectId +
                ", Name='" + Name + '\'' +
                ", Region='" + Region + '\'' +
                ", BSGContact='" + BSGContact + '\'' +
                ", PDMContact='" + PDMContact + '\'' +
                ", TfocusId='" + TfocusId + '\'' +
                ", CEMTeam='" + CEMTeam + '\'' +
                '}';
    }
}
