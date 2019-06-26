package com.app;

import java.util.concurrent.TimeUnit;

public class Wait_Notify_Ex {

	private static int[] buffer;
	private static int count;

	private static Object lock = new Object();

	static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	static class Producer {
		void produce() {
			synchronized (lock) {
				if (isFull(buffer)) {
					try {
						System.out.println("producer-thread waiting..");
						lock.wait();
						System.out.println("producer-thread got notification..");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				buffer[count++] = 1;
				System.out.println("producer-thread notifying..."+count);
				lock.notify();
			}
		}
	}

	static class Consumer {
		void consume() {
			synchronized (lock) {
				if (isEmpty(buffer)) {
					try {
						System.out.println("consumer-thread waiting..");
						lock.wait();
						System.out.println("consumer-thread got notification..");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				buffer[--count] = 0;
				lock.notify();
				System.out.println("consumer-thread notifying..."+count);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		buffer = new int[5];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable produceTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
			}
			System.out.println("Done producing");
		};

		Runnable consumeTask = () -> {
			for (int i = 0; i < 45; i++) {
				consumer.consume();
			}
			System.out.println("Done consuming");
		};

		Thread consumerThread = new Thread(consumeTask);
		Thread producerThread = new Thread(produceTask);

		consumerThread.start();
		producerThread.start();

		consumerThread.join();
		producerThread.join();

		System.out.println("Data in the buffer: " + count);

	}

}
