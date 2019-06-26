package com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.model.Product;

public class Lib {

	public static List<Product> filter(List<Product> inp, Predicate<Product> predicate) {
		List<Product> out = new ArrayList<>();
		for (Product product : inp) {
			if (predicate.test(product))
				out.add(product);
		}
		return out;
	}

}
