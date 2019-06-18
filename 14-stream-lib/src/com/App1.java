package com;

import java.util.Arrays;
import java.util.List;

import com.lib.Lib;
import com.model.Product;

public class App1 {

	public static void main(String[] args) {

		//
		List<Product> products = Arrays.asList(
				new Product(123121, "item-1", 1000.00),
				new Product(123127, "item-7", 7000.00),
				new Product(123123, "item-3", 3000.00),
				new Product(123122, "item-2", 2000.00),
				new Product(123125, "item-5", 5000.00),
				new Product(123126, "item-6", 6000.00),
				new Product(123124, "item-4", 4000.00)
		);
		
		//---------------------------------------------
		
		// SQL : select name from products p where p.price>5000
		List<Product> r1= Lib.filter(products, e->e.getPrice()>5000);
		List<String> r2=Lib.map(r1, e->e.getName());
		Lib.forEach(r2, System.out::println);
		
		// or 
		
		// function -chaining / pipeline pattern
		// ---------------------------------------------------
		System.out.println();
		
		products
		.stream()
		.filter(e->e.getPrice()>5000)
		.map(e->e.getName())
		.forEach(System.out::println);
		
		// --------------------------------------------------
		
		System.out.println();
		
		// SQL : select name from products p where p.price<5000
		List<Product> r3= Lib.filter(products, e->e.getPrice()<5000);
		List<String> r4=Lib.map(r3, e->e.getName());
		Lib.forEach(r4, System.out::println);
		
		System.out.println();
		
		// SQL : select id from products p where p.name=item-1
		List<Product> r5= Lib.filter(products, e->e.getName().equals("item-1"));
		List<Integer> r6=Lib.map(r5, e->e.getId());
		Lib.forEach(r6, System.out::println);
		
		//---------------------------------------------

	}

}
