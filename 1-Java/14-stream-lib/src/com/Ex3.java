package com;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

//how to create streams?

public class Ex3 {

	public static void main(String[] args) {

		// A. finite stream

		// Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Integer[] numbers= {1,2,3,4,5,6,7,8,9,10}; // collection
		// Stream<Integer> stream=Arrays.stream(numbers);

		// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// numbers.stream().forEach(System.out::println);

		// B. infinite stream
		
//		Random random=new Random();
//		Stream<Integer> stream=Stream.generate(()->{
//			return random.nextInt();
//		});
		
//		Stream<Integer> stream=Stream.iterate(0, n->n+1);
//		stream.forEach(System.out::println);
		
		
		
		

	}

}
