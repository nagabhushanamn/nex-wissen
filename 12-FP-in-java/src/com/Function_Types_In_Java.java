package com;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Function_Types_In_Java {

	public static void main(String[] args) {

//		Predicate<String> predicate = s -> s.isEmpty();
//		Supplier<String> supplier = () -> "beer";
//		Consumer<String> consumer = s -> System.out.println(s);
//		Function<String, Integer> function = s -> s.length();
//		BiPredicate<Integer, Integer> biPredicate=(n1,n2)->n1>n2;
//		BiFunction<Integer, Integer, Integer> biFunction=(n1,n2)->n1+n2;

		// -------------------------------------------------
//
//		BiFunction<Integer, Integer, Integer> biFunction = (n1, n2) -> n1 + n2;
//		int res = biFunction.apply(12, 13);
//		System.out.println(res);

		// -------------------------------------------------
//
//		IntBinaryOperator binaryOperator = (n1, n2) -> n1 + n2;
//		int res = binaryOperator.applyAsInt(12, 13);
//		System.out.println(res);

		// -------------------------------------------------

		// ToIntFunction<String> function=s->s.length();
		// IntToLongFunction intToLongFunction = i -> i + 1000000;

		// -------------------------------------------------

//		UnaryOperator<String> operator = s -> s.toUpperCase();
//		IntUnaryOperator intUnaryOperator = i -> i;

	}

}
