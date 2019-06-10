package com.app;

import com.app.emp.Employee;

public class Accessor_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee(111, "EMP");
//		employee.salary = 1000.00;
//		employee.bonus = employee.salary * 0.2;
		employee.setSalary(1000.00);

		// -------------------------------------------

//		employee.bonus = 100000.00;
//		employee.salary = -100;

		// -------------------------------------------

		System.out.println(employee.getSalary());
		System.out.println(employee.getBonus());

	}

}
