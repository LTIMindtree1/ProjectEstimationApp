package com.ProjectEstimationApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProjectController  {
	
	@RequestMapping("/")
	public ModelAndView Home() {
		 ModelAndView modelAndView = new ModelAndView("Home.html");
		   // modelAndView.addObject("message", "Baeldung");
		    return modelAndView;
	}
	 

}
