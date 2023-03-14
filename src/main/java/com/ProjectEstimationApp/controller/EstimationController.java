package com.ProjectEstimationApp.controller;

import com.ProjectEstimationApp.entity.*;
import com.ProjectEstimationApp.repository.ModuleRepository;
import com.ProjectEstimationApp.repository.SubModuleRepository;
import com.ProjectEstimationApp.service.ModuleDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
public class EstimationController {

	@Autowired
	ModuleDBService moduleDBService;
	@Autowired
	ModuleRepository moduleRepository;
	@Autowired
	SubModuleRepository subModuleRepository;

	@GetMapping("/getModule")
	public ResponseEntity<List<ModuleList>> getModule(){
		List<ModuleList> li=moduleDBService.getModule();
		return ResponseEntity.ok(li);
	}
	@GetMapping("/getSubModule")
	public ResponseEntity<List<SubModuleList>> getSubModule(){
		List<SubModuleList> li=subModuleRepository.findAll();
		return ResponseEntity.ok(li);
	}
	
	public ResponseEntity<List<QuestionList>> getQuestion(){
		List<QuestionList> questionLists = moduleDBService.getQuestion();
		return ResponseEntity.ok(questionLists);
	}
	
	public ResponseEntity<List<AssumptionList>> getAssumptionList(){
		List<AssumptionList> assumptionList = moduleDBService.getAssumptionList();
		return ResponseEntity.ok(assumptionList);
	}
	@GetMapping("/getRisk1")
	public ResponseEntity<List<RiskList>> getRiskList(){
		List<RiskList> riskList = moduleDBService.getRisk();
		return ResponseEntity.ok(riskList);
	}

	@GetMapping("/download-ppt/{action}")
	public void PPT(@PathVariable String action, HttpServletResponse response) throws IOException {
		moduleDBService.downloadPPT(response, action);
	}

}
