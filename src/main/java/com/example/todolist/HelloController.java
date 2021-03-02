package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/{month}")
	public String Hello(@PathVariable("month") int month, Model model) {
		model.addAttribute("month",month);
		return "main";
	}
}
