package com.example.todolist.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todolist.dto.TodoListDto;
import com.example.todolist.service.TodoListService;

@Controller
public class TodoListController {
	@Resource(name="com.example.todolist.service.TodoListService")
	TodoListService service;
	
	@RequestMapping(value = "/{month}")
	public String Month(@PathVariable("month") int month, Model model) {
		model.addAttribute("month",month);
		List<TodoListDto> list = service.selectAll(month);
		System.out.println(list.toString());
		return "main";
	}
}
