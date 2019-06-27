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

public class App2 {

	public static void doComputation() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " : computation Initiated..");
		boolean b = true;
		while (b) {
		}
		System.out.println("computation completed..");
	}

	public static void doIO() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " : IO initiated....");
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

		Thread thread1 = new Thread(() -> {
			doIO();
		});
		Thread thread2 = new Thread(() -> {
			doComputation();
		});

		thread1.run();
		thread2.start();

		System.out.println(name + " ..................");

	}

}
