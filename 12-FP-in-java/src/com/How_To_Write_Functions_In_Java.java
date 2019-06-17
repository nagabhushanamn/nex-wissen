package com;

import java.util.function.Predicate;

import com.model.Product;

// using 'Functional Interface '

// i.e type of java function is 'Functional Interface'

// FI ==> any interface with 'single-abstract-method' ( sam )

/*
 * 
 *  syntax of function
 *  
 *  
 * 	FI v=param(s)-> body             -- Lambda Expression
 * 
 * 		 p1      -> expression
 *       p1      -> {expression(s)}
 *      (p1,p2)  -> {expression(s)}
 *       
 * 	
 */

// e.g
@FunctionalInterface
interface StringToIntMapper {
	int map(String s);
}

public class How_To_Write_Functions_In_Java {

	public static void main(String[] args) {

		// E.g-1
		Predicate<Product> predicate = (t) -> t.getPrice() == 1000.00;
		boolean b = predicate.test(new Product(111, "Item", 1000.00));
		System.out.println(b);

		// E.g-2
//		StringToIntMapper mapper = (String s) -> {
//			// ..
//			return s.length();
//		};
		// or
//		StringToIntMapper mapper = (s) -> {
//			// ..
//			return s.length();
//		};
		// or
//		StringToIntMapper mapper = s -> {
//			// ..
//			return s.length();
//		};
		// or
		
		StringToIntMapper mapper = s -> s.length();

	}

}
