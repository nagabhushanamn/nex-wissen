package com;

import java.util.Random;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {

		Random random = new Random();
		// Build
		Stream<Integer> stream = Stream.generate(() -> {
			return random.nextInt();
		});
		
		// compose with intermediate operation(s)
		Stream<Integer> newStream=
		stream
		.peek(n->{
			System.out.println("before +ve filter "+n);
		})
		.filter(n->n>0)
		.peek(n->{
			System.out.println("before even filter "+n);
		})
		.filter(n->n%2==0)
		.limit(10)
		.peek(n->{
			System.out.println("before limit "+n);
		});
		
		
		// terminal
		newStream
		.forEach(System.out::println);
		

	}

}
