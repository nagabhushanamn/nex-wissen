package com.app;

class Counter {

	private long count;

	public synchronized void incerement() {
		this.count = this.count + 1;  // ==> read -> increment -> write
	}

	public long get() {
		return count;
	}
}

public class RaceCondition_Ex {

	public static void main(String[] args) throws InterruptedException {

		Counter counter1 = new Counter(); // shared-resource

		Runnable counterTask = () -> {
			for (int i = 0; i < 1000; i++) {
				counter1.incerement();
			}
		};

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(counterTask);
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		System.out.println(counter1.get()); // 1000 * 1000 ==> 1000000
		

	}

}
