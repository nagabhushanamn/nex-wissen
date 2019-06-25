package com;

import java.util.concurrent.CountDownLatch;

class Counter {

	private long count;

	public synchronized void incerement() {
		this.count = this.count + 1; // ==> read -> increment -> write
	}

	public long get() {
		return count;
	}
}

public class Ex7 {

	public static void main(String[] args) throws InterruptedException {

		Counter counter1 = new Counter();

		CountDownLatch countDownLatch = new CountDownLatch(1000);

		Runnable counterTask = () -> {
			for (int i = 0; i < 100000; i++) {
				counter1.incerement();
			}
			countDownLatch.countDown();
		};

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(counterTask);
			threads[i].start();
		}

		countDownLatch.await();

		System.out.println(counter1.get()); // 1000 * 1000 ==> 1000000

	}

}
