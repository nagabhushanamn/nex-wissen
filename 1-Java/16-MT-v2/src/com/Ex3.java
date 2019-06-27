package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Ex3 {

	public static void main(String[] args) {

		Callable<String> foodTask = () -> {
			// ..
			TimeUnit.SECONDS.sleep(5);
			// String food = "biryani";
			// return food;
			throw new IllegalAccessException("no food");
		};

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> future = executorService.submit(foodTask);

		System.out.println(future.isDone());
		System.out.println(future.isCancelled());

		try {
			String food = future.get();
			System.out.println(food);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
