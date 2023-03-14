package com.ProjectEstimationApp.model;

import com.ProjectEstimationApp.entity.ProspectDetails;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProspectModuleResponse {
    private EstimationRequest objEstimationRequest;
    private List<Response> objlstResponse;


}
