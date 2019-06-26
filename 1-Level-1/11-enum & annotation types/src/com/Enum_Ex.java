package com;

// why we need enum ?

//	==> to define constant(s) with java-type

/*
 * 
 *  i.e group of related constants with type
 * 
 */

enum Gender {
	MALE, FEMALE
}

class Employee {
	private int id;
	private String name;
	private Gender gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}

public class Enum_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(12123);
		employee.setName("EMP");
		employee.setGender(Gender.MALE);

		// ------------------------------------

	}

}
