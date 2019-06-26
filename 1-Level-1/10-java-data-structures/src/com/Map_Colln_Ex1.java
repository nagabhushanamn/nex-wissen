package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_Colln_Ex1 {

	public static void main(String[] args) {

//		Map<Integer, String> map = new TreeMap<>();
//		Map<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(123, "veg-biryani");
		map.put(125, "mut-biryani");
		map.put(124, "ch-biryani");
		map.put(124, "ch-biryani");

//		System.out.println(map.get(124));

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + " - " + map.get(key));
		}

	}

}
