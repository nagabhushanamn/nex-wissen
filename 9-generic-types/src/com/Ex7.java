package com;

import java.util.ArrayList;
import java.util.Collection;

class Box1<T> {
	// T stands for "Type"
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Ex7 {

	public static void someMethod(Number n) {
	}

	public void boxTest(Box1<Number> n) {
	}

	public static void main(String[] args) {

		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger; // OK

		someMethod(new Integer(10)); // OK
		someMethod(new Double(10.1)); // OK

		Box1<Number> box1 = new Box1<Number>();
		box1.add(new Integer(10)); // OK
		box1.add(new Double(10.1)); // OK

		Box1<Integer> box2 = new Box1<Integer>();
		box2.add(new Integer(10)); // OK

//		box1=box2; // error
		
		
		Collection<Number> collection=new ArrayList<Number>();
		
	}

}
