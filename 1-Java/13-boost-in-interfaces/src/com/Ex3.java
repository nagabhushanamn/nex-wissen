package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public int compareTo(Product o) {
		return Double.compare(this.price, o.price);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Product product1 = new Product(234678, "laptop", 1000.00);
		Product product2 = new Product(345678, "mobile", 2000.00);
		Product product3 = new Product(131232, "ipad", 1000.00);
		Product product4 = new Product(131232, "camera", 500.00);

//		System.out.println(product1 == product2);
//		System.out.println(product1.equals(product2));

//		System.out.println(product1.compareTo(product2));

		List<Product> products = new ArrayList<>();
		products.add(null);
		products.add(product3);
		products.add(product1);
		products.add(product2);
		products.add(product4);

		// Collections.sort(products); // Natural compare i.e by price asc

		Comparator<Product> byPriceAsc = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
		// Comparator<Product> byPriceDsc = (o1, o2) ->
		// Double.compare(o2.getPrice(),o1.getPrice());

		Comparator<Product> byPriceDsc = byPriceAsc.reversed();
		Comparator<Product> byNameDsc = (o1, o2) -> o2.getName().compareTo(o1.getName());

		Comparator<Product> byPriceAndbyName = byPriceDsc.thenComparing(byNameDsc);

		byPriceAndbyName = Comparator.nullsFirst(byPriceAndbyName);

		Collections.sort(products, byPriceAndbyName);

		for (Product product : products) {
			System.out.println(product);
		}

		products.forEach(item -> System.out.println(item));
		products.forEach(System.out::println);
		
		

	}

}
