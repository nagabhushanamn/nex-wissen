package com.app;

import com.app.service.TodoService;

public class App {

	public static void main(String[] args) {

		TodoService todoService = new TodoService();
		todoService.addTodo("Nag", "item-1");
		todoService.addTodo("Nag", "item-3");
		todoService.addTodo("Nag", "item-2");

//		System.out.println(todoService.size("Nag"));

		//todoService.editTodo("Nag", 3, "item-three");
		todoService.completeTodo("Nag", 3);
		todoService.completeTodo("Nag", 3);
		
		
		

		todoService.sort("Nag", "title").forEach(System.out::println);

	}

}
