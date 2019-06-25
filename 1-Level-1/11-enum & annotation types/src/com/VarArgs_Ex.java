package com;

public class VarArgs_Ex {

	public static void main(String... args) {

		display1(new int[] { 12, 13, 14 });
		display2(12);
		display2(12, 13);
		display2(12, 13, 14);
		display2(12, 13, 14, 15);

	}

	private static void display1(int[] args) {
		for (int n : args)
			System.out.println(n);
	}

	// VarArgs ( from JDK 1.5 )
	private static void display2(int i,int... args) {
		for (int n : args)
			System.out.println(n);
	}

}
