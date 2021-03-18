package com.example.todolist.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "/delete/{num}/{month}")
	public List<TodoListDto> delete(@PathVariable("num")int num, @PathVariable("month")int month) {
		System.out.println(num);
		service.deleteData(num);
		List<TodoListDto> list = service.selectAll(month);
		return list;
	}
	
	@RequestMapping(value = "/insertMonth/{month}/{content}")
	public List<TodoListDto> insert(@PathVariable("month")int month, @PathVariable("content")String content) {
		System.out.println(month+"///"+content);
		TodoListDto dto = new TodoListDto();
		dto.setMonth(month);
		dto.setContent(content);
		dto.setStatus("to do");
		service.insertData(dto);
		List<TodoListDto> list = service.selectAll(month);
		return list;
	}
}
