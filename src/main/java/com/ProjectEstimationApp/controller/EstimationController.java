package com.ProjectEstimationApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EstimationController {
	
	@GetMapping("/estimation")
	public ModelAndView estimation() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("estimation");
		
		return mav;
	}
	
	@GetMapping("/questions")
	public ModelAndView question() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("questions");
		
		return mav;
	}	

}
