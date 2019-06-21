package com;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAPI_Ex {

	private static int[] buffer;
	private static int count;

//	private static Object lock = new Object();
	private static Lock lock = new ReentrantLock();
	private static Condition notFull = lock.newCondition();
	private static Condition notEmpty = lock.newCondition();

	static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	static class Producer {

		void produce() {
			try {
				lock.lock();
				if (isFull(buffer)) {
					try {
						notFull.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[count++] = 1;
				notEmpty.signal();
			} finally {
				lock.unlock();
			}
		}
	}

	static class Consumer {
		void consume() {
			try {
				lock.lock();
				if (isEmpty(buffer)) {
					try {
						notEmpty.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[--count] = 0;
				notFull.signal();
			} finally {
				lock.unlock();
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
