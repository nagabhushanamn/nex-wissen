package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = null;
		// executorService = Executors.newSingleThreadExecutor();
		// executorService = Executors.newFixedThreadPool(10);
		executorService = Executors.newCachedThreadPool();

		Runnable task = () -> {
			Thread thread = Thread.currentThread();
			System.out.println(thread + " hello");
		};

		for (int i = 0; i < 10; i++) {
			executorService.submit(task);
		}
		TimeUnit.SECONDS.sleep(2);
		for (int i = 0; i < 10; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();

	}

}
