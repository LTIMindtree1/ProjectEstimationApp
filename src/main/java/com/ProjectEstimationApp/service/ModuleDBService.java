package com.ProjectEstimationApp.service;
import com.ProjectEstimationApp.entity.AssumptionList;
import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.QuestionList;
import com.ProjectEstimationApp.entity.RiskList;
import com.ProjectEstimationApp.model.*;

import java.util.List;

public interface ModuleDBService {

    List<ModuleList> getModule();

    List<QuestionList> getQuestion();

    List<AssumptionList> getAssumptionList();

    List<RiskList> getRisk();

    List<Response> getModuleList(EstimationRequest estimationRequest);

}
