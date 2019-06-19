package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Colln_Ex2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add(0, "a");
		list.set(1, "AA");
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains("a"));
		System.out.println(list.indexOf("a"));
		System.out.println(list.get(0));
		System.out.println(list.isEmpty());
		System.out.println(list.size());

		// ---------------------------------------------

		List<String> sheet1 = new ArrayList<>();
		sheet1.add("A");
		sheet1.add("C");
		sheet1.add("B");
		sheet1.add("D");

		sheet1.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println(sheet1);

		ListIterator<String> listIterator = sheet1.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);
		}
		while (listIterator.hasPrevious()) {
			String string = (String) listIterator.previous();
			System.out.println(string);
		}

		List<String> sheet2 = new ArrayList<>();
		sheet2.add("A");
		sheet2.add("E");
		sheet2.add("Z");
		sheet2.add("D");

		sheet1.removeAll(sheet2);
		sheet1.retainAll(sheet2);
		System.out.println(sheet1);

		// ---------------------------------------------

	}

}
