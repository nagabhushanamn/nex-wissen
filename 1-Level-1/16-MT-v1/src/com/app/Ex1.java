package com.app;

import java.util.concurrent.TimeUnit;

public class Ex1 {

	public static void main(String[] args) {

		Runnable foodTask = () -> {
			System.out.println("eat breakfast");
			try {
				//Thread.sleep(5000);
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("eat lunch");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("eat dinner");
		};

		Thread thread = new Thread(foodTask);
		thread.start();

	}

}
