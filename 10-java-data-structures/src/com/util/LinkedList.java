package com.util;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

	private Node head = null;

	public void add(E e) {
		Node newNode = new Node(e);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
	}

	public void add(int idx, E e) {

	}

	public void set(int idx, E e) {

	}

	public E get(int idx) {
		// ..
		return null;
	}

	public void reverse() {

	}

	public void remove(int idx) {

	}

	public void remove(E e) {

	}

	public Iterator<E> iterator() {
		// ..
//		// way-1 : Named Local Inner class
//		class IteratorImpl implements Iterator<E> {
//			Node temp = head;
//
//			@Override
//			public boolean hasNext() {
//				if (temp != null)
//					return true;
//				else
//					return false;
//			}
//
//			@Override
//			public E next() {
//				E e = temp.getData();
//				temp = temp.getNext();
//				return e;
//			}
//
//		}
//		return new IteratorImpl();

		// way-2 : Anonymous Local Inner class
		return new Iterator<E>() {
			Node temp = head;

			@Override
			public boolean hasNext() {
				if (temp != null)
					return true;
				else
					return false;
			}

			@Override
			public E next() {
				E e = temp.getData();
				temp = temp.getNext();
				return e;
			}
		};
	}

	private class Node {
		private E data;
		private Node next;

		public Node(E data) {
			super();
			this.data = data;
		}

		public Node(E data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
