package com.example.todolist.dto;

public class TodoListDto {
	private int num;
	private int month;
	private String content;
	private String status;
	@Override
	public String toString() {
		return "TodoListDto [num=" + num + ", month=" + month + ", content=" + content + ", status=" + status + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
