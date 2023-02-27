package com.ProjectEstimationApp.controller;

import com.ProjectEstimationApp.entity.ModuleList;
import com.ProjectEstimationApp.entity.QuestionList;
import com.ProjectEstimationApp.entity.SubModuleList;
import com.ProjectEstimationApp.repository.ModuleRepository;
import com.ProjectEstimationApp.repository.QuestionRepository;
import com.ProjectEstimationApp.repository.SubModuleRepository;
import com.ProjectEstimationApp.service.ModuleDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
	/*	List<String> response = li.stream().map(e -> e.getModuleName()).collect(Collectors.toList());*/
		return ResponseEntity.ok(li);
	}

	@GetMapping("/getSubModule")
	public ResponseEntity<List<SubModuleList>> getSubModule(){
		List<SubModuleList> li=subModuleRepository.findAll();
		return ResponseEntity.ok(li);
	}
	@GetMapping("/getQuestion")
	public ResponseEntity<List<QuestionList>> getQuestion(){
		List<QuestionList> questionLists = moduleDBService.getQuestion();
		return ResponseEntity.ok(questionLists);
	}

}
