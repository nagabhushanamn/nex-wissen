package com;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

}

public class Method_Reference_Ex2 {

	public static void main(String[] args) {

		// 1. instance methods

		// a.specified instance
		String str = "wissen";
		Supplier<Integer> supplier1 = () -> str.length(); // Lambda syntax
		Supplier<Integer> supplier2 = str::length; // MR syntax

//		b. unspecified instance
		Function<String, Integer> function1 = s -> s.length();
		Function<String, Integer> function2 = String::length;

		// 2. static methods
		BiFunction<Integer, Integer, Integer> biFunction1 = (n1, n2) -> Integer.compare(n1, n2);
		BiFunction<Integer, Integer, Integer> biFunction2 = Integer::compare;

		// 3.constructor
		BiFunction<Integer, String, Employee> biFunction3 = (id, name) -> new Employee(id, name);
		BiFunction<Integer, String, Employee> biFunction4 = Employee::new;
		Function<Integer, Employee> function3 = Employee::new;

	}

}
