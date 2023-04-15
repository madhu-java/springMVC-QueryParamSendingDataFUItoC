package com.myskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {
@GetMapping("/service")
	public String displayQuery(@RequestParam("name")String str,Model model) {
	
	String message = str.concat(" Welcome to mySkills.com");
	model.addAttribute("message", message);
	 return "index";
}
@GetMapping("/service2")
public String displayDetails(@RequestParam("name") String name,
		@RequestParam("address") String address,Model model) {
	String message = "Hello "+name+" welcome to "+address;
	model.addAttribute("message", message);
	return "index";
}
}
