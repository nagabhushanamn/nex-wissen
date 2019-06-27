package com.app;

import java.util.concurrent.TimeUnit;

public class Ex2 {

	public static void main(String[] args) {

		Runnable teachTask = () -> {
			System.out.println("tnr answering Q...");
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("tnr answering Q... finished");
		};

		Thread tnrThread = new Thread(teachTask);

		Runnable learnTask = () -> {
			System.out.println("student learning...");
			System.out.println("got doubt...");
			try {
				tnrThread.start();
				tnrThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("student cont.. learning afte soln");
		};

		Thread studThread = new Thread(learnTask);
		studThread.start();

	}

}
