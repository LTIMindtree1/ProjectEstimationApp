package com.ProjectEstimationApp.controller;

import com.ProjectEstimationApp.entity.*;
import com.ProjectEstimationApp.repository.ModuleRepository;
import com.ProjectEstimationApp.repository.QuestionRepository;
import com.ProjectEstimationApp.repository.SubModuleRepository;
import com.ProjectEstimationApp.service.ModuleDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

import com.ProjectEstimationApp.model.AssumptionsList;
import com.ProjectEstimationApp.model.QuestionsCollection;

import ch.qos.logback.core.subst.Token.Type;

@Controller
public class EstimationController {

	@Autowired
	ModuleDBService moduleDBService;
	@Autowired
	ModuleRepository moduleRepository;
	@Autowired
	SubModuleRepository subModuleRepository;

	// private Model model=null;

	@RequestMapping("/home")
	public String Home() {
		return "home";
	}

	@RequestMapping("/estimation")
	public String estimation() {

		return "estimation";
	}
@GetMapping("/getQuestion")
	public String getAllQuestion(Model model) {
	List<QuestionList> list = moduleDBService.getQuestion();
		model.addAttribute("list",list);
		return "questions";
	}
@GetMapping("/getAssumption")
public String getAssumptionList(Model model) {
	List<AssumptionList> assumptionList =moduleDBService.getAssumptionList();
	model.addAttribute("assumptionList",assumptionList);
	System.out.println(assumptionList);
	return "assumptions";
}

@GetMapping("/getModules")
public String getModule(Model model) {
	List<ModuleList> modules = moduleDBService.getModule();
	model.addAttribute("modules",modules);
	System.out.println(modules);
	return "moduleList";
}
	
	/*
	 * @GetMapping("/getModule") public ResponseEntity<List<ModuleList>> getModule()
	 * { List<ModuleList> li = moduleDBService.getModule(); return
	 * ResponseEntity.ok(li); }
	 * 
	 * 
	 
	
	 * 
	 * @GetMapping("/getSubModule") public ResponseEntity<List<SubModuleList>>
	 * getSubModule(){ List<SubModuleList> li=subModuleRepository.findAll(); return
	 * ResponseEntity.ok(li); }
	
	 * @GetMapping("/getRisk") public ResponseEntity<List<RiskList>> getRiskList(){
	 * List<RiskList> riskList = moduleDBService.getRisk(); return
	 * ResponseEntity.ok(riskList); }
	 * 
	 * @RequestMapping("/risk") public String risk() { return "risk"; }
	 */
}
