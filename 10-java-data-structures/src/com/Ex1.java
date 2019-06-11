package com;

import java.util.Iterator;

import com.util.LinkedList;

public class Ex1 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		// ...

		linkedList.add("milk");
		linkedList.add("juice");
		linkedList.add("beer");

		// ---------------------------

		// looping / traversing / iterating

		// way-1 : for loop

//		for (int i = 0; i < 3; i++) {
//			// ..
//		}

		// way-2 : iterator
//		Iterator<String> iterator = linkedList.iterator();
//		while (iterator.hasNext()) {
//			String e = iterator.next();
//			System.out.println(e);
//		}

		// way-3 : for-each loop
		for (String e : linkedList) {
			System.out.println(e);
		}

	}

}
