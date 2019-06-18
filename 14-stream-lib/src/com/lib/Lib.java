package com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lib {

	public static <T> List<T> filter(List<T> inp, Predicate<T> predicate) {
		List<T> out = new ArrayList<>();
		for (T e : inp) {
			if (predicate.test(e))
				out.add(e);
		}
		return out;
	}

	public static <T, R> List<R> map(List<T> inp, Function<T, R> func) {
		List<R> out = new ArrayList<>();
		for (T e : inp) {
			out.add(func.apply(e));
		}
		return out;
	}

	public static <T> void forEach(List<T> inp, Consumer<T> consumer) {
		for (T e : inp) {
			consumer.accept(e);
		}
	}

}
