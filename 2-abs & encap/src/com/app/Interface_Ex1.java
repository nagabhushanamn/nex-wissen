package com.app;

//-------------------------------------------------------

// abstraction / interface 
interface I {
	// constant state
	public static final int VAR = 100;

	// abstract behva
	public abstract double service(int inp);
}

// encapsulation / implemntation
class Impl implements I {

	@Override
	public double service(int inp) {
		return 0.0;
	}

}

//-------------------------------------------------------
// Interface usage
//-------------------------------------------------------

// e.g java's data-structure module( collections )

interface Iterable {
	boolean hasNext();

	String next();
}

interface Collection extends Iterable {
	void add(String s);

	void clear();
	// ...
}

interface List extends Collection {
	void add(int idx, String s);
	// ..
}

interface Set extends Collection {
	// ..
}

//-------------------------------------------------------

abstract class AbstractList implements List {
	public void clear() {
		// ..
		System.out.println("List:: clear()");
	}
}

//-------------------------------------------------------

class ArrayList extends AbstractList implements List {

	@Override
	public void add(String s) {
		// ..
	}

	@Override
	public void add(int idx, String s) {
		// ..
	}

//	@Override
//	public void clear() {
//		// ..
//	}

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

//	@Override
//	public void clear() {
//		// ..
//	}

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

public class Interface_Ex1 {

	public static void main(String[] args) {

//		ArrayList arrayList = new ArrayList();
//		arrayList.add("a");
//		arrayList.add(0, "A");
//		arrayList.clear();
//		
//		
//		LinkedList linkedList=new LinkedList();
//		linkedList.add("b");
//		linkedList.add(0,"B");
//		linkedList.clear();

// -----------------------------------------------

		List list = new ArrayList();
		list.add("A");
		list.clear();

		list = new LinkedList();
		list.add("B");
		list.clear();

// -----------------------------------------------

	}

}
