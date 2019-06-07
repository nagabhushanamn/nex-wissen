
// package declaration
package com.app.emp;

// import statements
import java.lang.*;

// public type
public class Employee {

	// I. state ==> variables

	// a. class/static variables
	public final static String COMP_NAME = "Wissen";
	public static String tnrName;

	// b. instance/object variables
	public int id;
	public String name;

	// II. constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// III.behavior ==> methods

//	a. class/static methods
	public static void teach() {
		System.out.println("Employee :: teach()");
	}

//	b. instance/object methods
	public void listenAndWork() {
		System.out.println(this.name + " listenAndWork()");
	}

	// IV. nested types

	// V. code blocks

}

// default type
class Abc {

}
