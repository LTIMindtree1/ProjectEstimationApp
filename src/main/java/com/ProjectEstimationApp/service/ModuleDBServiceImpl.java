package com.ProjectEstimationApp.service;

import com.ProjectEstimationApp.entity.AssumptionList;
import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.QuestionList;
import com.ProjectEstimationApp.entity.RiskList;
import com.ProjectEstimationApp.model.QuestionListResponse;
import com.ProjectEstimationApp.repository.AssumptionRepository;
import com.ProjectEstimationApp.repository.ModuleRepository;
import com.ProjectEstimationApp.repository.QuestionRepository;
import com.ProjectEstimationApp.repository.RiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleDBServiceImpl implements ModuleDBService {

    @Autowired
    private ModuleRepository repository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AssumptionRepository assumptionRepository;

    @Autowired
    private RiskRepository riskRepository;

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


}
