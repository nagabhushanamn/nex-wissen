package com;

import java.util.function.Consumer;

//------------------------------------------
// Top-Level-
//------------------------------------------

interface Iterable {
	boolean hasNext();

	String next();
}

interface Collection extends Iterable {
	void add(String s);

	void clear();

	// ...
	default void forEach(Consumer consumer) {
		// ..
	}

	public static void staMethod() {
		// ..
	}
}

interface List extends Collection {
	void add(int idx, String s);
	// ..
}

interface Set extends Collection {
	// ..
}

//-------------------------------------------------------
// Middle Level
//-------------------------------------------------------

abstract class AbstractList implements List {
	public void clear() {
		// ..
		System.out.println("List:: clear()");
	}
}

//-------------------------------------------------------
// Bottom-Level
//-------------------------------------------------------

class ArrayList extends AbstractList implements List {

	@Override
	public void add(String s) {
		// ..
	}

	@Override
	public void forEach(Consumer consumer) {
		// .. ArrayList forEach
	}

	@Override
	public void add(int idx, String s) {
		// ..
	}

	@Override
	public boolean hasNext() {
		// ..
		return false;
	}

	@Override
	public String next() {
		// ..
		return null;
	}

}

class LinkedList extends AbstractList implements List {

	@Override
	public void add(String s) {
		// ..
	}

	@Override
	public void add(int idx, String s) {
		// ..
	}

	@Override
	public void forEach(Consumer consumer) {
		// ..
	}

	@Override
	public boolean hasNext() {
		// ..
		return false;
	}

	@Override
	public String next() {
		// ..
		return null;
	}

}

public class Ex1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("item-1");
		list.forEach(item -> System.out.println(item));

	}

}
