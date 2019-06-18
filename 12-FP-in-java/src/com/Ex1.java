package com;

import java.util.function.Function;

public class Ex1 {

	public static void main(String[] args) {

		Function<String, Integer> function1 = s -> {
			System.out.println("before :: Log");
			int i = Integer.parseInt(s);
			System.out.println("after :: Log");
			return i;
		};

		Function<Integer, String> function2 = i -> {
			System.out.println("before :: Log");
			String s = String.valueOf(i);
			System.out.println("after :: Log");
			return s;
		};

		System.out.println(function1.apply("123"));
		System.out.println();
		System.out.println(function2.apply(123));

	}

}
