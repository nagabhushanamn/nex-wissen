package com.app.emp;

// java bean
public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
			this.bonus = this.salary * 0.2;
		}
	}

	public double getBonus() {
		return bonus;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
