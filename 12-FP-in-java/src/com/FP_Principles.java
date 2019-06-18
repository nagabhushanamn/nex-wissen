package com;

import java.util.function.Predicate;

/*
 * 
 * 

	in FP-language, functions are first-class values/citizens
    
    - A function can be stored in a variable
    - A parameter of a function can be a function
    - The return value of a function can be a function
    
 * 
 * 
 */


/*
 * 
 *  Higher-Order_Programming  i.e Function composition
 *  
 *  	use ?
 *  
 *  ==> by composing small function(s), we can build complex algorithms
 * 
 */


/*
 * 
 *  why FP ?
 *  
 *  	==> promotes 'Higher-Order-Programming', 
 *  		i.e with small& re-usable function, we can build complex function. 
 * 
 */

public class FP_Principles {

	// Higher-Order-Function(s) ==> Higher-Order_Programming
	public static Predicate<Integer> and(Predicate<Integer> p1, Predicate<Integer> p2) {
		return i -> p1.test(i) && p2.test(i);
	}

	public static void main(String[] args) {

		Predicate<Integer> predicate1 = i -> i > 50;
		Predicate<Integer> predicate2 = i -> i < 100;

		Predicate<Integer> predicate = and(predicate1, predicate2);

		boolean b = predicate.test(60);
		System.out.println(b);

	}

}
