package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex4 {

	public static List<String> readFile(String fileName) throws FileNotFoundException, IOException {
		List<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
		return list;

	}

	public static void main(String[] args) {

		Callable<List<String>> task1 = () -> {
			return readFile("veg.txt");
		};
		Callable<List<String>> task2 = () -> {
			return readFile("non-veg.txt");
		};

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Collection<Callable<List<String>>> tasks = Arrays.asList(task1, task2);
		try {
			List<Future<List<String>>> futures = executorService.invokeAll(tasks);
			for (Future<List<String>> future : futures) {
				List<String> list = future.get();
				System.out.println(list);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
