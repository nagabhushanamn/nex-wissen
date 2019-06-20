package com;

import java.util.ArrayList;
import java.util.List;

public class Ex {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("veg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");

//		list.removeIf(item -> item.equals("nveg"));
		list.replaceAll(item->item.equals("nveg")?"Nil":item);
		System.out.println(list);

	}

}
