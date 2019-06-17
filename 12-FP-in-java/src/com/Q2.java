package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("nveg");
		menu.add("veg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");
		menu.add("nveg");
		menu.add("veg");

		// --------------------------------------
		// way-1 : imperative style
		// --------------------------------------

//		for (int i = 0; i < menu.size(); i++) {
//			String item = menu.get(i);
//			if (item.equals("nveg"))
//				menu.remove(i);
//		}
//		System.out.println(menu);

		// --------------------------------------
		// way-2 : imperative style
		// --------------------------------------
//		Iterator<String> it = menu.iterator();
//		while (it.hasNext()) {
//			String item = it.next();
//			if (item.equals("nveg"))
//				// menu.remove(item);
//				it.remove();
//		}
//		System.out.println(menu);

		// --------------------------------------
		// way-3 : declarative style with function ==> FUnctional Programming
		// --------------------------------------
		menu.removeIf(item->item.equals("nveg"));
		System.out.println(menu);

	}

}
