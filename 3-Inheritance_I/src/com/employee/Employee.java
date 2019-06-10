package com.employee;

public class Employee {

	private int id;
	public String name;
	public double salary;

	public Employee(int id) {
		if (id > 0)
			this.id = id;
		else
			throw new IllegalArgumentException("invalid employee id");
	}

	public int getId() {
		return this.id;
	}

}