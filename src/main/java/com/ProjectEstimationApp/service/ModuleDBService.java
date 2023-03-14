package com.ProjectEstimationApp.service;
import com.ProjectEstimationApp.entity.AssumptionList;
import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.QuestionList;
import com.ProjectEstimationApp.entity.RiskList;
import com.ProjectEstimationApp.model.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ModuleDBService {

    List<ModuleList> getModule();

    List<QuestionList> getQuestion();

    List<AssumptionList> getAssumptionList();

    List<RiskList> getRisk();

    ProspectModuleResponse getModuleList(EstimationRequest estimationRequest);

    void downloadPPT(HttpServletResponse response, String product) throws IOException;
}
