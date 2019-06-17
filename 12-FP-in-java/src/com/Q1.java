package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("nveg");
		menu.add("veg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");

		
		// get all veg items
		List<String> vegMenu = new ArrayList<>();
		for (int i = 0; i < menu.size(); i++) {
			String item = menu.get(i);
			if (item.equals("veg"))
				vegMenu.add(item);
		}
		System.out.println(vegMenu);
		
		
		// or
		
		vegMenu=menu
				.stream()
				.filter(t->t.equals("veg"))
				.collect(Collectors.toList());

	}

}
