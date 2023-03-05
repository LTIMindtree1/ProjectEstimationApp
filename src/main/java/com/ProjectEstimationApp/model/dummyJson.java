package com.ProjectEstimationApp.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class dummyJson {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        ProspectDetails prospectDetails = new ProspectDetails();
        prospectDetails.setName("Sushant");
        prospectDetails.setBSGContact("BSGContact");
        prospectDetails.setCEMTeam("CEMTeam");
        prospectDetails.setPDMContact("PDMContact");
        prospectDetails.setTfocusId("TfocusId");
        prospectDetails.setRegion("Hazaribag");


        Channels channels= new Channels();
        channels.setMobile(true);
        channels.setResponsiveWeb(true);
        channels.setTablet(false);

        Languages languages = new Languages();
        languages.setLeftToRight("1");
        languages.setRightToLeft("1");
        languages.setTransactBackend(false);

        ProductSelected productSelected = new ProductSelected();
        productSelected.setSMEBanking(true);
        productSelected.setRetailBanking(true);

        EstimationRequest estimationRequest = new EstimationRequest();
        estimationRequest.setProspectDetails(prospectDetails);
        estimationRequest.setChannels(channels);
        estimationRequest.setLanguages(languages);
        estimationRequest.setProductSelected(productSelected);


        String Json = objectMapper.writeValueAsString(estimationRequest);
        System.out.println(Json);
    }
}
