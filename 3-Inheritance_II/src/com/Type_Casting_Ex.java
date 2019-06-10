package com;

/*
 * 
 *  types
 *  -------
 *  
 *  1. primitive
 *  	a. implicit
 *  	b. explicit
 *  2. reference
 *  	a. implicit
 *  	b. explicit
 * 
 */

class Vehicle {
}

class Car extends Vehicle {
}

class Bike extends Vehicle {
}

public class Type_Casting_Ex {

	public static void main(String[] args) {

		// Quiz

//		int a = 6;
//		int b = 4;
//		
//		float c = (float)a / b;
//
//		System.out.println(c);

		// -----------------------------------
		// B. Reference
		// -----------------------------------

		Car car = new Car();
		Bike bike = new Bike();

		Vehicle vehicle1 = car;
		vehicle1 = bike; // implicit casting ( up casting )

		//

		Vehicle vehicle2 = new Car();
//		vehicle2 = new Bike();

		if (vehicle2 instanceof Car) {
			Car car2 = (Car) vehicle2; // Explicit casting ( down casting )
			System.out.println("All is well");
		} else
			System.out.println("invalid casting");

		// -----------------------------------
		// A. primitives casting
		// -----------------------------------

		byte byteValue = 12;
		int intValue = byteValue; // implicit
		byteValue = (byte) intValue;

		// Quiz

		int i = 456;
		byte b = (byte) i;
		System.out.println(b);
//
//		for (int j = 0; j < 128; j++) {
//			System.out.printf("%d -> %c \n", j, (char) j);
//		}

	}

}
