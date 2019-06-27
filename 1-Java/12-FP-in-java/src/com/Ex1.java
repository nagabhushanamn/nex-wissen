package com;

import java.util.function.Function;

public class Ex1 {

	public static void main(String[] args) {

		Function<String, Integer> function1 = s -> {
			int i = Integer.parseInt(s);
			return i;
		};

		Function<String, Integer> function2 = s -> {
			int i = s.length();
			return i;
		};

		// Higher-Order-Function i.e function composition
		Function<Function<String, Integer>, Function<String, Integer>> logWrapper = inpFunc -> {
			return s -> {
				System.out.println("before :: LOG");
				int r = inpFunc.apply(s);
				System.out.println("after :: LOG");
				return r;

			};
		};

		Function<String, Integer> function1WithLog = logWrapper.apply(function1);
		Function<String, Integer> function2WithLog = logWrapper.apply(function2);

		int r = function1WithLog.apply("123");
		System.out.println(r);
		int rr = function2WithLog.apply("hello");
		System.out.println(rr);

	}

}
