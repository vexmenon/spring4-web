package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@GetMapping("/home")
	public ModelAndView homeView() {
		return new ModelAndView("home");
	}

}
