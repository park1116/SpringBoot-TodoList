package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoListController {
	
	@RequestMapping(value = "/{month}")
	public String Month(@PathVariable("month") int month, Model model) {
		model.addAttribute("month",month);
		return "main";
	}
}
