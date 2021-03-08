package com.example.todolist.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.todolist.dto.TodoListDto;
import com.example.todolist.service.TodoListService;

@RestController
public class TodoListController {
	@Resource(name="com.example.todolist.service.TodoListService")
	TodoListService service;
	
	@RequestMapping(value = "/{month}")
	public ModelAndView Month(@PathVariable("month")int month, ModelAndView mav) {
		System.out.println(month);
		List<TodoListDto> list = service.selectAll(month);
		
		mav.setViewName("main");
		mav.addObject("month",month);
		mav.addObject("list", list);
		return mav;
	}
}
