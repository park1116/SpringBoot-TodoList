package com.example.todolist.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.todolist.dto.TodoListDto;
import com.example.todolist.mapper.TodoListMapper;

@Service("com.example.todolist.service.TodoListService")
public class TodoListService {
	@Resource(name="com.example.todolist.mapper.TodoListMapper")
	TodoListMapper mapper;

	public List<TodoListDto> selectAll(int month) {
		return mapper.selectAll(month);
	}
	
	public int insertData(TodoListDto dto) {
		return mapper.insertData(dto);
	}
	
	public int deleteData(int num) {
		return mapper.deleteData(num);
	}
}
