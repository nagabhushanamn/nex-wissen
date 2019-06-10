package com;

class A extends Object {

	public A(int a) {
		super();
		System.out.println("Im A");
	}

}

class B extends A {
	public B(int a) {
		super(a);
		System.out.println("Im B");
	}
}

class C extends B {

	public C(int a) {
		super(a);
		System.out.println("Im C");
	}

}

public class Constructor_Execution_Flow_Ex {

	public static void main(String[] args) {

		C c = new C(12);

	}

}
