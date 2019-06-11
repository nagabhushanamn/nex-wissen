package com.util;

public class LinkedList<E> {

	private Node<E> head = null;

	public void add(E e) {
		Node<E> newNode = new Node<E>(e);
		if (head == null) {
			head = newNode;
		} else {
			// ..
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

	public void iterator() {
		// ..

	}

	private class Node<E> {
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
