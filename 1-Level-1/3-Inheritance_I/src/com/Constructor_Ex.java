package com;

import java.util.Scanner;

class Product {

	int id;
	String name;
	double price;

	public Product(int id) {
		if (id > 0)
			this.id = id;
		else
			throw new IllegalArgumentException("id cannot be -ve");
	}

	public Product(int id, String name) {
//		if (id > 0)
//			this.id = id;
//		else
//			throw new IllegalArgumentException("id cannot be -ve");
		this(id);
		if (name != null & !name.isEmpty())
			this.name = name;
		else
			throw new IllegalArgumentException("name cannot be null or empty");

//		this(id, name, 0.0);
	}

	public Product(int id, String name, double price) {
//		if (id > 0)
//			this.id = id;
//		else
//			throw new IllegalArgumentException("id cannot be -ve");
//		if (name != null & !name.isEmpty())
//			this.name = name;
//		else
//			throw new IllegalArgumentException("name cannot be null or empty");
		this(id,name);
		this.price = price;
	}

}

public class Constructor_Ex {

	public static void main(String[] args) {

		Product product = new Product(111, "Laptop", 100.00);
		System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.price);

		// -----------------------------------------

		Scanner scanner = new Scanner(System.in);

	}

}
