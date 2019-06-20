package com.app;

import java.util.concurrent.TimeUnit;


/*
 * A third possibility is to use a dedicated object to synchronize
   It is always a good idea to hide an object used for synchronization
 * 
 */

class C {

	private static Object readLock = new Object();
	private static Object writeLock = new Object();

	String name;

	public void m1() {
		synchronized (readLock) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + this.name + " ::m1() start");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " : A::m1() end");
		}
	}

	public void m2() {
		synchronized (writeLock) {
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
}

public class Synchronized_Keyword_Ex3 {

	public static void main(String[] args) {

		C c1 = new C();
		c1.name = "c1";
		C c2 = new C();
		c2.name = "c2";

		Runnable task1 = () -> {
			c1.m1();
		};
		Runnable task2 = () -> {
			c1.m2();
		};
//		Runnable task3 = () -> {
//			c2.m1();
//		};

		Thread thread1 = new Thread(task1, "T1");
		Thread thread2 = new Thread(task2, "T2");
//		Thread thread3 = new Thread(task3, "T3");

		thread1.start();
		thread2.start();
//		thread3.start();
	}

}
