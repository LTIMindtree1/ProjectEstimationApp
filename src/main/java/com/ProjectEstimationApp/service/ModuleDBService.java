package com.ProjectEstimationApp.service;
import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.QuestionList;

import java.util.List;

public interface ModuleDBService {

    List<ModuleList> getModule();

    List<QuestionList> getQuestion();
}
