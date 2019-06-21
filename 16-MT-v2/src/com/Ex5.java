package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex5 {

	public static void main(String[] args) {

//		Object key = new Object();
		Lock lock = new ReentrantLock();

		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			try {
				if (lock.tryLock(4, TimeUnit.SECONDS)) {
					System.out.println(name + " started...");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(name + " finished");
				} else {
					System.out.println(name + " leaving ..");
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.submit(task);
		executorService.submit(task);
		executorService.submit(task);

		executorService.shutdown();

	}

}
