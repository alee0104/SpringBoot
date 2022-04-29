package com.hcl.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {
	@GetMapping("/mvc")
	public String mvc(ModelMap model) {
		model.addAttribute("title","Welcome Students");
		model.addAttribute("msg","Welcome to Springboot");
		return "welcome";
		
	}
	
}
