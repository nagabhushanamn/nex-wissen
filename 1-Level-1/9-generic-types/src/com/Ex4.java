package com;

class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}

public class Ex4 {

	public static void main(String[] args) {

		Pair<Integer, String> pair1 = new OrderedPair<>(123, "java");
		Pair<Integer, String> pair2 = new OrderedPair<>(123, "java");

		boolean b = Util.compare(pair1, pair2);
		System.out.println(b);

	}

}
