package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.model.Product;
import com.model.ProductType;

public class Ex2 {

	public static void main(String[] args) {

		// source
		List<Product> products = Arrays.asList(new Product(123121, "item-1", 1000.00, ProductType.TV),
				new Product(123127, "item-7", 7000.00, ProductType.MOBILE),
				new Product(123123, "item-3", 3000.00, ProductType.MOBILE),
				new Product(123122, "item-2", 2000.00, ProductType.TV),
				new Product(123125, "item-5", 5000.00, ProductType.MOBILE),
				new Product(123126, "item-6", 6000.00, ProductType.MOBILE),
				new Product(123124, "item-4", 4000.00, ProductType.TV));

		// ----------------------------------------------
		// External Iteration
		// ----------------------------------------------

		// ----------------------------------------------
		// way-1 : for / while / do-while
		// ----------------------------------------------

//		double total = 0.0;
//		for (int i = 0; i < products.size(); i++) {
//			Product product = products.get(i);
//			if (product.getType() == ProductType.MOBILE) {
//				total += product.getPrice();
//			}
//		}
//
//		System.out.println("Total : " + total);

		// ----------------------------------------------

		// ----------------------------------------------
		// way-2 : iterator pattern
		// ----------------------------------------------

//		double total = 0.0;
//		Iterator<Product> iterator = products.iterator();
//		while (iterator.hasNext()) {
//			Product product = (Product) iterator.next();
//			if (product.getType() == ProductType.MOBILE) {
//				total += product.getPrice();
//			}
//		}
//
//		System.out.println("Total : " + total);

		// ----------------------------------------------

		// ----------------------------------------------
		// way-3 : iterator pattern ==> for-each loop ( from JDK 1.5 )
		// ----------------------------------------------

//		double total = 0.0;
//		for (Product product : products) {
//			if (product.getType() == ProductType.MOBILE) {
//				total += product.getPrice();
//			}
//		}
//
//		System.out.println("Total : " + total);

		// ----------------------------------------------
		
		// Limitations of 'externa;' iteration
		
		/*
		 * 
		 *  ==> code always in 'imperative style'
		 *  ==> sequential execution  ,  difficult to parallelize this code
		 *  ==> lot of 'temp' variables
		 *  ==> more verbose
		 */
		
		// ----------------------------------------------
		
		

		// ----------------------------------------------
		// Internal Iteration ==> stream lib ( JDK 1.8 )  : collection pipeline pattern
		// ----------------------------------------------
		
		
		double total=
		
		products
		.stream()
		.filter(item->item.getType()==ProductType.MOBILE)
//		.map(Product::getPrice)
//		.reduce(0.0,(acc,next)-> acc+next);
		.mapToDouble(Product::getPrice)
		.sum();
		
		System.out.println(total);
		
		
		
		

	}

}
