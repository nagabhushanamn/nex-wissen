package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Colln_Ex1 {

	public static void compareList(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add("string" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();

		compareList(arrayList);
		compareList(linkedList);

	}

}
