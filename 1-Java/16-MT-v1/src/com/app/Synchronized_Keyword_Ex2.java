package com.app;

import java.util.concurrent.TimeUnit;

/*
 * 
 * A synchronized non-static method uses the instance as a synchronization object
 * 
 */

class B {
	String name;

	public synchronized void m1() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + this.name + " ::m1() start");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " : A::m1() end");
	}

	public synchronized void m2() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + this.name + " ::m2() start");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " : A::m2() end");
	}
}

public class Synchronized_Keyword_Ex2 {

	public static void main(String[] args) {

		B b1 = new B();
		b1.name = "b1";
		B b2 = new B();
		b2.name = "b2";

		Runnable task1 = () -> {
			b1.m1();
		};
		Runnable task2 = () -> {
			b1.m2();
		};
		Runnable task3 = () -> {
			b2.m1();
		};

		Thread thread1 = new Thread(task1, "T1");
		Thread thread2 = new Thread(task2, "T2");
		Thread thread3 = new Thread(task3, "T3");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
