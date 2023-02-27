package com.ProjectEstimationApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ProjectEstimationApp.model.ProspectDetails;

import ch.qos.logback.core.subst.Token.Type;

@Controller
public class EstimationController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
@RequestMapping(value = "/details",method = RequestMethod.GET)
	public ResponseEntity<?> NextPage(@RequestBody ProspectDetails prosepect){
		System.out.println("Before");
		//System.out.println(prosepect.getName()+""+prosepect.getRegion()+"    "+prosepect.getBsgContact()+"    "+prosepect.getPdmContact()+"    "+prosepect.getTfocusID()+"    "+prosepect.getCemTeam());
		System.out.println("After");
		//ModelAndView model=new ModelAndView()
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
