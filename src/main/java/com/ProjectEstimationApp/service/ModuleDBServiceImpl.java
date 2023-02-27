package com.ProjectEstimationApp.service;

import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.QuestionList;
import com.ProjectEstimationApp.repository.ModuleRepository;
import com.ProjectEstimationApp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleDBServiceImpl implements ModuleDBService {

    @Autowired
    private ModuleRepository repository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<ModuleList> getModule() {
        return repository.findAll();
    }

    @Override
    public List<QuestionList> getQuestion() {
        return questionRepository.findAll();
    }


}
