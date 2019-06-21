package com;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//  cyclic barrier

public class Ex8 {

	public static void main(String[] args) throws InterruptedException {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(10);

		Runnable task = () -> {
			int count = 0;
			for (int i = 0; i < 1000; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + "step-count-" + i);
			}
			try {
				cyclicBarrier.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : total-count - " + count);
		};

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			executorService.submit(task);
		}
		
		
		
	}

}
