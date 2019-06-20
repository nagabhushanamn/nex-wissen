package com.app;

public class App3 {

	public static void main(String[] args) {

		// Runnable / Running
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " initiated task");
			for (int i = 0; i < 1000000; i++) {
				System.out.println(threadName + " task-step-" + i);
				// --> if sleep / blocked / wait --> Not-Ready-To-Run
			}
			System.out.println(threadName + " completed task");
		};
		// --> Dead

//		task.run();

		Thread thread = new Thread(task, "A"); // New
//		thread.run(); 
		thread.start(); // New ---> Ready-To-Run / Runnable

		Thread thread2 = new Thread(task, "B"); // New
//		thread.run(); 
		thread2.start(); // New ---> Ready-To-Run / Runnable

	}

}
