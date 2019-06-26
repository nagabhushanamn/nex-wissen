package com.app;

public class Ex3 {

	public static void main(String[] args) {

		Runnable bigTask = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				System.out.println(name + " -> " + i);
				if (i == 10)
					Thread.yield();
			}
		};

		Thread thread1 = new Thread(bigTask, "A");
		Thread thread2 = new Thread(bigTask, "B");

		thread1.start();
		thread2.start();

	}

}
