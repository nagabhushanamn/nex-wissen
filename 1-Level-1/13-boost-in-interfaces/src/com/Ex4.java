package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Ex4 {

	public static void writeToFile(String log) {
		File file = new File("log.txt");
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.write(log);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Consumer<String> consoleLogger = log -> System.out.println(log);
		Consumer<String> fileLogger = Ex4::writeToFile;

//		consoleLogger.accept("started...");
//		fileLogger.accept("started...");

		// way-1
//		BiFunction<Consumer<String>, Consumer<String>, Consumer<String>> compose = (f1, f2) -> {
//			return log -> {
//				f1.accept(log);
//				f2.accept(log);
//			};
//		};
//
//		Consumer<String> logger = compose.apply(consoleLogger, fileLogger);
//		logger.accept("started...again..");

		Consumer<String> logger = consoleLogger.andThen(fileLogger);

	}

}
