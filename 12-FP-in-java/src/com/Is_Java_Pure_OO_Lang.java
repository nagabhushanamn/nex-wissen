package com;

class Box<E> {

}

public class Is_Java_Pure_OO_Lang {

	public static void main(String[] args) {

		Box<Integer> box = new Box<>();

		int a = 12; // Value
		//
//		Integer integer = new Integer(a); // Boxing
//		a=integer.intValue(); // Unboxing

		Integer integer = a; // Auto Boxing ( jdk 1.5 )
		a = integer; // Auto Boxing

		/*
		 * 
		 * 
		 * Number Byte Short Integer Long
		 * 
		 * Character
		 * 
		 * Double Float
		 * 
		 * Boolean
		 * 
		 * 
		 */

	}

}
