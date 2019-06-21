package com;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Read_Write_Lock_Ex {

	public static void main(String[] args) {

		Map<String, String> cache = new HashMap<String, String>();
//		Lock lock = new ReentrantLock();
		ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		Lock readLock = readWriteLock.readLock();
		Lock writeLock = readWriteLock.writeLock();

		Runnable writeTask = () -> {
			try {
				writeLock.lock();
				System.out.println("write started...");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				cache.put("key", "biryani");
				System.out.println("write finished..");
			} finally {
				writeLock.unlock();
			}
		};

		Runnable readTask = () -> {
			try {
				readLock.lock();
				System.out.println("read started...");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String key = "key";
				String data = cache.get(key);
				System.out.println(data);
				System.out.println("read finished...");
			} finally {
				readLock.unlock();
			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.submit(writeTask);
		executorService.submit(readTask);
		executorService.submit(readTask);
		executorService.submit(readTask);

	}

}
