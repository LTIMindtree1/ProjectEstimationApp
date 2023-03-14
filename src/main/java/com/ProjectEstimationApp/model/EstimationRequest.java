package com.ProjectEstimationApp.model;

import com.ProjectEstimationApp.entity.ProspectDetailsEntity;

public class EstimationRequest {
    public ProspectDetailsEntity prospectDetails;
    public Channels channels;
    public Languages languages;
    public ProductSelected productSelected;

    public ProspectDetailsEntity getProspectDetails() {
        return prospectDetails;
    }

    public void setProspectDetails(ProspectDetailsEntity prospectDetails) {
        this.prospectDetails = prospectDetails;
    }

    public Channels getChannels() {
        return channels;
    }

    public void setChannels(Channels channels) {
        this.channels = channels;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public ProductSelected getProductSelected() {
        return productSelected;
    }

    public void setProductSelected(ProductSelected productSelected) {
        this.productSelected = productSelected;
    }

    @Override
    public String toString() {
        return "EstimationRequest{" +
                "prospectDetails=" + prospectDetails +
                ", channels=" + channels +
                ", languages=" + languages +
                ", productSelected=" + productSelected +
                '}';
    }
}
