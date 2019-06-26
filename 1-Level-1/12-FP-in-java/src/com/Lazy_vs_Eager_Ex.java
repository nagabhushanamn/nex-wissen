package com;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Lazy_vs_Eager_Ex {

	public static void main(String[] args) {
//
//		String s1 = "hello";
//		Objects.requireNonNull(s1, "s1 should not be null : " + getSystemLog());
//		Objects.requireNonNull(s1, () -> "s1 should not be null : " + getSystemLog());
//
//		System.out.println("all is well");

		// ----------------------------------------

		Consumer<String> consumer = s -> System.out.println("yummy with " + s);

		if (LocalTime.now().getHour() == 10)
			consumer.accept("chai");

		// ----------------------------------------

	}

	private static String getSystemLog() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return LocalDateTime.now().toString();
	}

}
