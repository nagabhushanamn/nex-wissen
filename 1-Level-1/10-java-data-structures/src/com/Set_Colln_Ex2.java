package com;

import java.util.LinkedHashSet;
import java.util.Set;

class Todo {
	private int id;
	private String title;
	private boolean completed;

	public Todo(int id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCompleted() {
		return completed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (completed != other.completed)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}

public class Set_Colln_Ex2 {

	public static void main(String[] args) {

		Todo todo1 = new Todo(123, "go swim", false);
		Todo todo2 = new Todo(124, "go home", false);
		Todo todo3 = new Todo(125, "go village", false);
		Todo todo4 = new Todo(124, "go home", false);

		// --------------------------------------------
//
//		Set<Todo> todos = new TreeSet<>((t1, t2) -> t1.getTitle().compareTo(t2.getTitle()));
//		todos.add(todo1);
//		todos.add(todo2);
//		todos.add(todo3);
//		todos.add(todo4);

		System.out.println(todo1.hashCode());
		System.out.println(todo2.hashCode());
		System.out.println(todo3.hashCode());
		System.out.println(todo4.hashCode());

//		Set<Todo> todos = new HashSet<>();
		Set<Todo> todos = new LinkedHashSet<>();
		todos.add(todo1);
		todos.add(todo2);
		todos.add(todo3);
		todos.add(todo4);

		// --------------------------------------------

		System.out.println();
		for (Todo todo : todos) {
			System.out.println(todo);
		}

	}

}
