package com;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Colln_Ex {

	public static void main(String[] args) {

		// Set<String> set = new TreeSet<>((x,y)->y.compareTo(x));
		// Set<String> set = new HashSet<>();
		Set<String> set = new LinkedHashSet<>();
		set.add("B");
		set.add("E");
		set.add("A");
		set.add("D");
		set.add("E"); // duplicate
		set.add("C");
		set.add("Z");
		set.add("P");

		System.out.println(set);

	}

}
