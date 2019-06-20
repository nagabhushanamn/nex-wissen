package com.app;

public class Ex4 {

	public static void main(String[] args) {

		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			int priority = Thread.currentThread().getPriority();
			System.out.println(name + " -> " + priority);
		};

		Thread thread1 = new Thread(task, "A");
		thread1.setPriority(Thread.MIN_PRIORITY);
		Thread thread2 = new Thread(task, "B");
		Thread thread3 = new Thread(task, "C");
		Thread thread4 = new Thread(task, "D");
		Thread thread5 = new Thread(task, "E");
		thread5.setPriority(Thread.MAX_PRIORITY);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

	}

}
