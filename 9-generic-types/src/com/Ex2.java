package com;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	
	public static void main(String[] args) {
		
//		List list = new ArrayList();
//		list.add("hello");
//		
//		String s = (String) list.get(0);
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0);   // no cast

		
	}

}
