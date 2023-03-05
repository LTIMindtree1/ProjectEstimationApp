package com.ProjectEstimationApp.service;

import com.ProjectEstimationApp.entity.*;
import com.ProjectEstimationApp.model.*;
import com.ProjectEstimationApp.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ModuleDBServiceImpl implements ModuleDBService {

    public Logger log = LoggerFactory.getLogger(ModuleDBServiceImpl.class);

    @Autowired
    private ModuleRepository repository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AssumptionRepository assumptionRepository;

    @Autowired
    private RiskRepository riskRepository;

    @Autowired
    private ProspectDetailsRepository prospectDetailsRepository;

    @Override
    public List<ModuleList> getModule() {
        return repository.findAll();
    }

    @Override
    public List<QuestionList> getQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public List<AssumptionList> getAssumptionList() {
        return assumptionRepository.findAll();
    }

    @Override
    public List<RiskList> getRisk() {
        return riskRepository.findAll();
    }
    public String product;
    @Override
    public List<Response> getModuleList(EstimationRequest estimationRequest) {

        String product = getProductSelected(estimationRequest.getProductSelected());
        String channel = getSelectedChannel(estimationRequest.getChannels());

        String ProspectDetailsSaved = saveProspectDetails(estimationRequest.getProspectDetails());
        log.debug(ProspectDetailsSaved);

        List<ModuleList> moduleList = repository.findAll();
        List<ModuleListResponse> ModuleList = new ArrayList<>();

        for (ModuleList mod : moduleList) {
            ModuleListResponse moduleListResponse = new ModuleListResponse();
            moduleListResponse.setModuleName(mod.getModuleName());
            moduleListResponse.setSubModuleLists(mod.getSubmodule());
            ModuleList.add(moduleListResponse);
        }

        List<Response> response = new ArrayList<>();

        for (ModuleListResponse m : ModuleList){
            Response response1 = new Response();
            response1.setModuleName(m.getModuleName());
            List<String> submodule = new ArrayList<>();

            for (int i =0; i< m.getSubModuleLists().size(); i++){
                SubModuleList subModuleList1 = m.getSubModuleLists().get(i);

                if(product.equalsIgnoreCase("RB+SME") && channel.equalsIgnoreCase("M,RW")){
                    if(subModuleList1.getProductMapping().contains(product) || product.contains(subModuleList1.getProductMapping())
                            && subModuleList1.getChannel().contains(channel) || channel.contains(subModuleList1.getChannel())){
                        submodule.add(subModuleList1.getSubmoduleName());
                    }
                }
                else if(subModuleList1.getProductMapping().contains(product)
                                && subModuleList1.getChannel().contains(channel)){
                    submodule.add(subModuleList1.getSubmoduleName());
                }
            }
            response1.setSubModules(submodule);
            response.add(response1);
        }
        return response;
    }

    private String saveProspectDetails(ProspectDetails prospectDetails) {

        ProspectDetailsEntity prospectDetailsEntity = new ProspectDetailsEntity();
        prospectDetailsEntity.setName(prospectDetails.getName());
        prospectDetailsEntity.setBSGContact(prospectDetails.getBSGContact());
        prospectDetailsEntity.setPDMContact(prospectDetails.getPDMContact());
        prospectDetailsEntity.setRegion(prospectDetails.getRegion());
        prospectDetailsEntity.setTfocusId(prospectDetails.getCEMTeam());
        prospectDetailsEntity.setCEMTeam(prospectDetails.getCEMTeam());

        prospectDetailsRepository.save(prospectDetailsEntity);

        return "Prospect Details Saved Inside DataBase";
    }

    private String getProductSelected(ProductSelected productSelected) {
        String product = null;
        if(productSelected.isRetailBanking() && productSelected.isSMEBanking()){
            product = "RB+SME";
        }else if(productSelected.isSMEBanking()){
            product = "SME";
        }else if(productSelected.isRetailBanking()){
            product = "RB";
        }else {
            product = null;
        }
        return product;
    }

    private String getSelectedChannel(Channels channels) {
        String channel = null;
        if(channels.isMobile() && channels.isResponsiveWeb()){
            channel = "M,RW";
        }else if(channels.isMobile()){
            channel = "M";
        }else if(channels.isResponsiveWeb()){
            channel = "RW";
        }else
            channel = null;
        return channel;
    }


}
