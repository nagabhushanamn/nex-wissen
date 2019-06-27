package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// custom colln
class Box<E> implements Iterable<E> {
	// ...
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Quiz {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		for (String string : arrayList) {
		}

		LinkedList<String> linkedList = new LinkedList<>();
		for (String string : linkedList) {
		}

		Box<String> box = new Box<>();
		for (String string : box) {
		}

	}

}
