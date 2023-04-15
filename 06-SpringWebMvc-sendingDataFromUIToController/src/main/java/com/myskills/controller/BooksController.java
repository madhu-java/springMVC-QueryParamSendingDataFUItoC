package com.myskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BooksController {
	@GetMapping("/book/{bname}/{authorname}")
	public String getBookDetails(@PathVariable("banme") String bname,
			                      @PathVariable("authorname")String aname,
			                       Model model) {
		
		String text="The book "+bname+" written by "+aname+" is very famous";
		model.addAttribute("message", text);
		return "index";
	}

}
