package com.app.model;

import java.time.LocalDateTime;

/*
 * 
 * java.util.Date
 * java.util.Calender
 * 
 *  from JDK 1.8
 *  
 *  java.time.*;
 *  
 *    - LocalDate
 *    - LocalTime
 *    - LOcalDateTime
 *    ...
 *  	
 * 
 */

public class Todo {

	private int id;
	private String title;
	private boolean completed;
	private LocalDateTime creationTime;

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + ", creationTime=" + creationTime+ "]";
	}

	public Todo(int id, String title) {
		super();
		this.id = id;
		this.title = title;
		this.creationTime = LocalDateTime.now(); // Asia/Kolkata
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}

}
