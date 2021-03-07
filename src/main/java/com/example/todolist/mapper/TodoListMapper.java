package com.example.todolist.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.todolist.dto.TodoListDto;

@Repository("com.example.todolist.mapper.TodoListMapper")
public interface TodoListMapper {
	public List<TodoListDto> selectAll(int month);
	
	public int insertData(TodoListDto dto);
	
	public int deleteData(int num);
}
