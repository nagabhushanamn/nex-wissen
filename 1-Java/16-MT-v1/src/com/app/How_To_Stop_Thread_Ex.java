package com.app;

import java.util.concurrent.TimeUnit;

public class How_To_Stop_Thread_Ex {

	public static void main(String[] args) {

		Runnable playTask = () -> {
			for (int i = 0; i < 10000; i++) {
				if (!Thread.currentThread().isInterrupted()) {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						break;
					}
					System.out.println("la la " + i);
				} else
					break;
			}
		};

		Thread thread = new Thread(playTask);
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.interrupt();

	}

}
