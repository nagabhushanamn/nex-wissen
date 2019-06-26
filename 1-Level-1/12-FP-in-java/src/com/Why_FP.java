package com;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.lib.Lib;
import com.model.Product;

// reason-1 : clean & concise code 

public class Why_FP {

	static List<Product> products = new ArrayList<>();

	static {
		products.add(new Product(321434, "item-1", 1000.00));
		products.add(new Product(421431, "item-2", 3000.00));
		products.add(new Product(221433, "item-3", 7000.00));
		products.add(new Product(621437, "item-4", 1000.00));
		products.add(new Product(821436, "item-5", 5000.00));

	}

	// ------------------------------------------------------
	// Imperative style ==> What + How
	// ------------------------------------------------------

	/*
	 * limitation : => can't re-use 'how' logic with different expectations
	 * 
	 */

//	private static List<Product> getProducts(double price) {
//		List<Product> out = new ArrayList<>();
//		for (Product product : products) {
//			if (product.getPrice() == price)
//				out.add(product);
//		}
//		return out;
//	}

//	private static List<Product> getProducts(double minPrice, double maxPrice) {
//		List<Product> out = new ArrayList<>();
//		for (Product product : products) {
//			if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
//				out.add(product);
//		}
//		return out;
//	}

	// ------------------------------------------------------
	// Declarative style ==> What : using Local Named Inner class
	// ------------------------------------------------------

//	private static List<Product> getProducts(double price) {
//		class ByPrice implements Predicate<Product> {
//			@Override
//			public boolean test(Product t) {
//				return t.getPrice() == price;
//			}
//		}
//		Predicate<Product> byPrice = new ByPrice();
//		return Lib.filter(products, byPrice);
//	}

	// ------------------------------------------------------
	// Declarative style ==> What : using Local Anonymous Inner class
	// ------------------------------------------------------

//	private static List<Product> getProducts(double price) {
//		Predicate<Product> byPrice = new Predicate<Product>() {
//			@Override
//			public boolean test(Product t) {
//				return t.getPrice() == price;
//			}
//		};
//		return Lib.filter(products, byPrice);
//	}

//	private static List<Product> getProducts(double minPrice, double maxPrice) {
//		Predicate<Product> byPrice = new Predicate<Product>() {
//			@Override
//			public boolean test(Product t) {
//				return t.getPrice() >= minPrice && t.getPrice() <= maxPrice;
//			}
//		};
//		return Lib.filter(products, byPrice);
//	}

	// ------------------------------------------------------
	// Declarative style ==> What : using function
	// ------------------------------------------------------

	private static List<Product> getProducts(double price) {
//		Predicate<Product> byPrice = (Product t) -> {
//			return t.getPrice() == price;
//		};
//		return Lib.filter(products, byPrice);
		// - or-
		return Lib.filter(products, t -> t.getPrice() == price);
	}

	private static List<Product> getProducts(double minPrice, double maxPrice) {
//		Predicate<Product> byRange =(Product t)-> {
//				return t.getPrice() >= minPrice && t.getPrice() <= maxPrice;
//		};
//		return Lib.filter(products, byRange);
		// - or-
		return Lib.filter(products, t -> t.getPrice() >= minPrice && t.getPrice() <= maxPrice);
	}

	private static void display(List<Product> products) {
		for (Product product : products)
			System.out.println(product);
	}

	public static void main(String[] args) {

		List<Product> products;
		// ---------------------------------------------------
//		products = getProducts(1000.00);
		products = getProducts(1000.00, 3000.00);
		display(products);
		// -----------------------------------------------------

	}

}
