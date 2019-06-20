package com.app;

import java.util.Scanner;

/*
 * 
 *  appln tasks
 *  
 *  	- computation tasks  ( internal )
 *  	- io tasks ( external )
 * 
 */

public class App1 {

	public static void doComputation() {
		System.out.println("Computation Initiated..");
		boolean b = true;
		while (b) {
		}
		System.out.println("Computation completed..");
	}

	public static void doIO() {
		System.out.println("IO initiated....");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ur name ?");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
		System.out.println("IO completed....");
	}

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println(name + " .....");

		// step-1
		doIO();

		// step-2:
		doComputation();

	}

}
