package com;

class A {

	public static void sta() {
		System.out.println("A :: sta()");
	}
}

class B extends A {

	public static void sta() {
		System.out.println("B :: sta()");
	}

}

public class Ex1 {

	public static void main(String[] args) {

		B.sta();

	}

}
