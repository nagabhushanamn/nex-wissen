package com;
//

//class Box {
//	
//	private Object object;
//
//	public void set(Object object) {
//		this.object = object;
//	}
//
//	public Object get() {
//		return object;
//	}
//}

class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

interface Pair<K, V> {
	public K getKey();

	public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class Ex3 {

	public static void main(String[] args) {

//		Box box = new Box();
//		Box<Integer> integerBox1 = new Box<Integer>();
//		// JDK 1.7
//		Box<Integer> integerBox2 = new Box<>();
//
//		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
//		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
//
//		OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
//		OrderedPair<String, String> p4 = new OrderedPair<>("hello", "world");
//
//		OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

		// -------------------------------------------------

//		Box<String> stringBox = new Box<>();
//		Box rawBox = stringBox;   

		// -------------------------------------------------

//		Box rawBox = new Box(); // rawBox is a raw type of Box<T>
//		Box<Integer> intBox = rawBox; // warning: unchecked conversion

//		-------------------------------------------------
//		Box<String> stringBox = new Box<>();
//		Box rawBox = stringBox;
//		rawBox.set(8); // warning: unchecked invocation to set(T)

//		-------------------------------------------------

//		Box<Integer> bi;
//		bi = createBox();

//		-------------------------------------------------

	}

	static Box createBox() {
		return new Box();
	}
}
