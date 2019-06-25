package com;

import java.util.Collections;
import java.util.Comparator;

public class Ex6 {

//	public static <T> int countGreaterThan(T[] anArray, T elem) {
//		int count = 0;
//		for (T e : anArray)
//			if (e > elem) // compiler error
//				++count;
//		return count;
//	}

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static void main(String[] args) {

		int r = countGreaterThan(new Integer[] { 1, 2, 3, 4, 5, 6 }, 4);
		r = countGreaterThan(new Double[] { 1.0, 2.0 }, 1.0);
		System.out.println(r);
		

	}

}
