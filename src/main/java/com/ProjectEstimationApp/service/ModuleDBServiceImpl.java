package com.ProjectEstimationApp.service;

import com.ProjectEstimationApp.entity.*;
import com.ProjectEstimationApp.model.*;
import com.ProjectEstimationApp.repository.*;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
    @Override
    public ProspectModuleResponse getModuleList(EstimationRequest estimationRequest) {

        // Master response -> Prospect Details and list of Response
        ProspectModuleResponse objProspectModuleResponse = new ProspectModuleResponse();

        // Set ProspectDetails to master object
        objProspectModuleResponse.setObjEstimationRequest(estimationRequest);

        String product = getProductSelected(estimationRequest.getProductSelected());
        String channel = getSelectedChannel(estimationRequest.getChannels());

        prospectDetailsRepository.save(estimationRequest.getProspectDetails());
        log.debug("Prospect Details Saved Inside DataBase");

        List<ModuleList> moduleList = repository.findAll();
        List<Response> response = new ArrayList<>();

        for (ModuleList m : moduleList){
            Response response1 = new Response();
            List<SubModuleList> submodule = new ArrayList<>();


            for(SubModuleList subModuleList1 : m.getSubmodule()){

               SubModuleList subModuleList = new SubModuleList();

               if(IsTrue(product,subModuleList1.getProductMapping()) &&
                  IsTrue(channel,subModuleList1.getChannel())) {

                   subModuleList.setSubmoduleName(subModuleList1.getSubmoduleName());
                   subModuleList.setChannel(subModuleList1.getChannel());
                   subModuleList.setProductMapping(subModuleList1.getProductMapping());

                   submodule.add(subModuleList);
               }
            }
            if(submodule.size()>0){
                response1.setModuleId(m.getModuleId());
                response1.setModuleName(m.getModuleName());
                response1.setSubModules(submodule);
                response.add(response1);
            }

        }
        // Adding final list of Response
        objProspectModuleResponse.setObjlstResponse(response);

        return objProspectModuleResponse;
    }

    @Override
    public void downloadPPT(HttpServletResponse response, String product) throws IOException {
        String Path;
        if(product.equalsIgnoreCase("SME"))
            Path = "ppt/SME.pptx";
        else if(product.equalsIgnoreCase("RETAIL"))
            Path = "ppt/RETAIL.pptx";
        else if (product.equalsIgnoreCase("WEALTH"))
            Path = "ppt/WEALTH.pptx";
        else
            throw new FileNotFoundException();

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(Path);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead = -1;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        byte[] pptBytes = outputStream.toByteArray();
        downloadPPT(response, pptBytes, Path);
    }

    public void downloadPPT(HttpServletResponse response, byte[] pptBytes, String fileName) throws IOException {
        response.setContentType("application/vnd.ms-powerpoint");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName.toUpperCase());
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(pptBytes);
        outputStream.flush();
        outputStream.close();
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

    boolean IsTrue(String UserInput, String DBInput){
        if(DBInput.length() >= UserInput.length()){
            return DBInput.contains(UserInput);
        }else{
            return UserInput.contains(DBInput);
        }
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
