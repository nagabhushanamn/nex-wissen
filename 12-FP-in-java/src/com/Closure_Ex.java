package com;

import java.util.function.Consumer;

/*
 * 
//------------------------------------------------------
// Function Closures
//------------------------------------------------------

/*
        A closure is a function having access to the parent scope, 
        even after the parent function has closed.
        
 */

public class Closure_Ex {

	public static void main(String[] args) {
		Consumer<String> learnFunc = teach("java");
		learnFunc.accept("STUD");
		learnFunc = null;
	}

	private static Consumer<String> teach(String sub) {
		System.out.println("teaching " + sub);
		String notes = sub + "-notes";
		Consumer<String> learn = stud -> {
			System.out.println(stud + " learning " + sub + " with " + notes);
		};
		// learn.accept("student");
		System.out.println("teaching  finished");
		return learn;
	}

}
