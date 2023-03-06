package com.ProjectEstimationApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProjectEstimationApp.entity.AssumptionList;
import com.ProjectEstimationApp.entity.Prospectde;
import com.ProjectEstimationApp.entity.QuestionList;
import com.ProjectEstimationApp.model.Channels;
import com.ProjectEstimationApp.model.EstimationRequest;
import com.ProjectEstimationApp.model.Languages;
import com.ProjectEstimationApp.model.ProductSelected;
import com.ProjectEstimationApp.model.ProspectDetails;
import com.ProjectEstimationApp.model.Response;
import com.ProjectEstimationApp.service.ModuleDBService;

@Controller
public class EstimationControllerui {
	@Autowired
	EstimationController controller;
	
	@Autowired
	ModuleDBService moduleDBService;
	
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/getEstimation")
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

	@PostMapping("/getmoduleList")
	public String getModuleList(@ModelAttribute ("prospect") Prospectde prospect, Model model) {
		
	ProspectDetails pros=new ProspectDetails();
	System.out.println(prospect);
	pros.setName(prospect.getName());
	pros.setRegion(prospect.getRegion());
	pros.setPDMContact(prospect.getPdmContact());
	pros.setBSGContact(prospect.getBsgContact());
	pros.setCEMTeam(prospect.getCemTeam());
	pros.setTfocusId(prospect.getTfocusID());
	
	Languages language=new Languages();
	language.setLeftToRight(prospect.getLanguageLTR());
	language.setRightToLeft(prospect.getLanguageRTL());
	
	//transact
	//boolean product=false;
	if(null!=prospect.getTransact()){
		language.setTransactBackend(true);
	} else
		language.setTransactBackend(false);
	
	//channel
	Channels channel=new Channels();
	boolean Mobile=false,Tablet=false,ResponsiveWeb=false;
	for(int i=0; i<prospect.getChannel().length;i++) {
		
		if(prospect.getChannel()[i].equalsIgnoreCase("mobile"))
			Mobile=true;
		if(prospect.getChannel()[i].equalsIgnoreCase("tablet"))
			Tablet=true;
		if(prospect.getChannel()[i].equalsIgnoreCase("responsiveweb"))
			ResponsiveWeb=true;
		
			
	}
	channel.setMobile(Mobile);
	channel.setTablet(Tablet);
	channel.setResponsiveWeb(ResponsiveWeb);
		
		
	
	
	//products
	ProductSelected prod=new ProductSelected();
	boolean RetailBanking=false, SMEBanking=false;
		
	for(int i=0;i<prospect.getProduct().length;i++) {
		if(prospect.getProduct()[i].equalsIgnoreCase("rb"))
			RetailBanking=true;
		if(prospect.getProduct()[i].equalsIgnoreCase("sme"))
			SMEBanking=true;
	}
		prod.setRetailBanking(RetailBanking);
		prod.setSMEBanking(SMEBanking);	
		
		//estimation Object
		EstimationRequest estimationRequest=new EstimationRequest();
		estimationRequest.setProspectDetails(pros);
		estimationRequest.setChannels(channel);
		estimationRequest.setLanguages(language);
		estimationRequest.setProductSelected(prod);
		List<Response> moduleListResponses = moduleDBService.getModuleList(estimationRequest);
		System.out.println(moduleListResponses);
		model.addAttribute("modules",moduleListResponses);
		
		return "ModuleList";
	}
}
