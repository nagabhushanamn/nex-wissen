package com;

import java.util.function.Consumer;

public class Var_Use_In_Function {

	static int staVar = 100;
	int insVar;

	public Var_Use_In_Function(int v) {
		this.insVar = v;
	}

	public Consumer<String> insMethod() {
		int loc = 300; // final or effective final
		Consumer<String> consumer = s -> {
			System.out.println(s);
			System.out.println(staVar);
			System.out.println(insVar);
			System.out.println(loc);
		};
		// consumer.accept("Variable usage");
		return consumer;
	}

	public static void main(String[] args) {

		Consumer<String> consumer = new Var_Use_In_Function(201).insMethod();
		consumer.accept("Variable usage");

	}

}
