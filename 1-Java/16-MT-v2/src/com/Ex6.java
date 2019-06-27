package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// semaphores

public class Ex6 {

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(1,true);

		Runnable task = () -> {
			try {
				semaphore.acquire(2);
				System.out.println(Thread.currentThread().getName() + " started ");
				TimeUnit.SECONDS.sleep(5);
				System.out.println(Thread.currentThread().getName() + " finished ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphore.release(1);
			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();

	}

}
