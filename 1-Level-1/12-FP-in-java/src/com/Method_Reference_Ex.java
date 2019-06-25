package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Method_Reference_Ex {

	public static boolean isNonVeg(String item) {
		return item.equals("nveg");
	}

	public static void main(String[] args) {

//		Function<String, Integer> function = s -> s.length();
//		function=String::length;
//		function.apply("hello");

		List<String> list = new ArrayList<>();
		list.add("veg");
		list.add("veg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");

		// -------------------------------------
		// way-1
		// -------------------------------------

//		list.removeIf(item->item.equals("nveg"));
//		System.out.println(list);

		// -------------------------------------
		// way-2
		// -------------------------------------

		list.removeIf(item -> Method_Reference_Ex.isNonVeg(item));
		System.out.println(list);

		// -------------------------------------
		// way-3
		// -------------------------------------
		
		Predicate<String> predicate=Method_Reference_Ex::isNonVeg;

		list.removeIf(Method_Reference_Ex::isNonVeg);
		System.out.println(list);

	}

}
