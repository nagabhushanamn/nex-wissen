package com;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {

	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args) {

		List<? extends Number> numbers1;
		numbers1 = new ArrayList<Integer>();
		numbers1 = new ArrayList<Double>();
		numbers1 = new ArrayList<Float>();

		List<? super Integer> numbers2;
		numbers2 = new ArrayList<Integer>();
		numbers2 = new ArrayList<Number>();

		List<Number> numbers3 = new ArrayList<>();
		addNumbers(numbers3);
		List<Integer> numbers4 = new ArrayList<>();
		addNumbers(numbers4);
		List<Double> numbers5 = new ArrayList<>();
		// addNumbers(numbers);

	}

}
