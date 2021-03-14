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
	
	@RequestMapping(value = "/data/{month}")
	public List<TodoListDto> month(@PathVariable("month")int month) {
		System.out.println(month);
		List<TodoListDto> list = service.selectAll(month);
		return list;
	}
	
	@RequestMapping(value = "/delete/{num}")
	public int delete(@PathVariable("num")int num) {
		System.out.println(num);
		int check = service.deleteData(num);
		return check;
	}
}
