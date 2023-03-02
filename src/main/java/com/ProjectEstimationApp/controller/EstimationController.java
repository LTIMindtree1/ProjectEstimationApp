package com.ProjectEstimationApp.controller;

import com.ProjectEstimationApp.entity.*;
import com.ProjectEstimationApp.model.QuestionListResponse;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;


import com.ProjectEstimationApp.model.AssumptionsList;
import com.ProjectEstimationApp.model.ProspectDetails;
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

	private Model model=null;

	@GetMapping("/getModule")
	public ResponseEntity<List<ModuleList>> getModule() {
		List<ModuleList> li = moduleDBService.getModule();
		return ResponseEntity.ok(li);
	}

	@RequestMapping("/home")
	public String Home() {
		return "home";
	}

	@RequestMapping("/estimation")
	public String estimation() {

		return "estimation";
	}

	@PostMapping("/questions")
	public String Contact(@ModelAttribute("prosepect") ProspectDetails prosepect) {
	model.addAttribute("prosepect",prosepect);
		return "moduleList";
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
	@GetMapping("/getAssumption")
	public ResponseEntity<List<AssumptionList>> getAssumptionList(){
		List<AssumptionList> assumptionList = moduleDBService.getAssumptionList();
		return ResponseEntity.ok(assumptionList);
	}
	@GetMapping("/getRisk")
	public ResponseEntity<List<RiskList>> getRiskList(){
		List<RiskList> riskList = moduleDBService.getRisk();
		return ResponseEntity.ok(riskList);
	}

	@GetMapping("/questions")
	public String QuestionMap(Model model) {

		ArrayList<QuestionsCollection> qc = new ArrayList<>();
		qc.add(new QuestionsCollection(1, "c1", "q1", "t1"));
		qc.add(new QuestionsCollection(2, "c2", "q2", "t2"));
		qc.add(new QuestionsCollection(3, "c3", "q3", "t3"));
		qc.add(new QuestionsCollection(4, "c4", "q4", "t4"));
		qc.add(new QuestionsCollection(5, "c5", "q5", "t5"));
		qc.add(new QuestionsCollection(6, "c6", "q6", "t6"));
		qc.add(new QuestionsCollection(7, "c7", "q7", "t7"));
		qc.add(new QuestionsCollection(8, "c8", "q8", "t8"));
		qc.add(new QuestionsCollection(9, "c9", "q9", "t9"));
		qc.add(new QuestionsCollection(10, "c10", "q10", "t10"));
		qc.add(new QuestionsCollection(11, "c11", "q11", "t11"));
		qc.add(new QuestionsCollection(12, "c12", "q12", "t12"));
		qc.add(new QuestionsCollection(13, "c13", "q13", "t13"));
		qc.add(new QuestionsCollection(14, "c14", "q14", "t14"));
		qc.add(new QuestionsCollection(15, "c15", "q15", "t15"));
		qc.add(new QuestionsCollection(16, "c16", "q16", "t16"));
		qc.add(new QuestionsCollection(17, "c17", "q17", "t17"));
		qc.add(new QuestionsCollection(18, "c18", "q18", "t18"));
		qc.add(new QuestionsCollection(19, "c19", "q19", "t19"));
		qc.add(new QuestionsCollection(20, "c20", "q20", "t20"));
		qc.add(new QuestionsCollection(21, "c21", "q21", "t21"));
		qc.add(new QuestionsCollection(22, "c22", "q22", "t22"));
		qc.add(new QuestionsCollection(23, "c23", "q23", "t23"));
		qc.add(new QuestionsCollection(24, "c24", "q24", "t24"));
		qc.add(new QuestionsCollection(25, "c25", "q25", "t25"));
		qc.add(new QuestionsCollection(26, "c26", "q26", "t26"));
		qc.add(new QuestionsCollection(27, "c27", "q27", "t27"));
		qc.add(new QuestionsCollection(28, "c28", "q28", "t28"));
		qc.add(new QuestionsCollection(29, "c29", "q29", "t29"));
		qc.add(new QuestionsCollection(30, "c30", "q30", "t30"));
		model.addAttribute("qc", qc);

		return "questions";

	}

	@RequestMapping("/assumptions")
	public String assumptions(Model model) {
		ArrayList<AssumptionsList> assum = new ArrayList<>();
		assum.add(new AssumptionsList(2, "c2", "q2", "t2"));
		assum.add(new AssumptionsList(1, "c1", "q1", "t1"));
		assum.add(new AssumptionsList(3, "c3", "q3", "t3"));
		assum.add(new AssumptionsList(4, "c4", "q4", "t4"));
		assum.add(new AssumptionsList(5, "c5", "q5", "t5"));
		assum.add(new AssumptionsList(6, "c6", "q6", "t6"));
		assum.add(new AssumptionsList(7, "c7", "q7", "t7"));
		assum.add(new AssumptionsList(8, "c8", "q8", "t8"));
		assum.add(new AssumptionsList(9, "c9", "q9", "t9"));
		assum.add(new AssumptionsList(10, "c10", "q10", "t10"));
		assum.add(new AssumptionsList(11, "c11", "q11", "t11"));
		assum.add(new AssumptionsList(12, "c12", "q12", "t12"));
		assum.add(new AssumptionsList(13, "c13", "q13", "t13"));
		assum.add(new AssumptionsList(14, "c14", "q14", "t14"));
		assum.add(new AssumptionsList(15, "c15", "q15", "t15"));
		assum.add(new AssumptionsList(16, "c16", "q16", "t16"));
		assum.add(new AssumptionsList(17, "c17", "q17", "t17"));
		assum.add(new AssumptionsList(18, "c18", "q18", "t18"));
		assum.add(new AssumptionsList(19, "c19", "q19", "t19"));
		assum.add(new AssumptionsList(20, "c20", "q20", "t20"));
		assum.add(new AssumptionsList(21, "c21", "q21", "t21"));
		assum.add(new AssumptionsList(22, "c22", "q22", "t22"));
		assum.add(new AssumptionsList(23, "c23", "q23", "t23"));
		assum.add(new AssumptionsList(24, "c24", "q24", "t24"));
		assum.add(new AssumptionsList(25, "c25", "q25", "t25"));
		assum.add(new AssumptionsList(26, "c26", "q26", "t26"));
		assum.add(new AssumptionsList(27, "c27", "q27", "t27"));
		assum.add(new AssumptionsList(28, "c28", "q28", "t28"));
		assum.add(new AssumptionsList(29, "c29", "q29", "t29"));
		assum.add(new AssumptionsList(30, "c30", "q30", "t30"));
		assum.add(new AssumptionsList(30, "c30", "q30", "t30"));
		model.addAttribute("assum", assum);
		return "assumptions";
	}

	@RequestMapping("/risk")
	public String risk() {
		return "risk";
	}

}
