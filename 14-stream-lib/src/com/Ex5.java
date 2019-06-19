package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Product;
import com.model.ProductType;

public class Ex5 {

	public static void main(String[] args) {

		//
		List<Product> products = Arrays.asList(new Product(123121, "item-1", 1000.00, ProductType.TV),
				new Product(123127, "item-7", 7000.00, ProductType.MOBILE),
				new Product(123123, "item-3", 3000.00, ProductType.MOBILE),
				new Product(123122, "item-2", 2000.00, ProductType.TV),
				new Product(123125, "item-5", 5000.00, ProductType.MOBILE),
				new Product(123126, "item-6", 6000.00, ProductType.MOBILE),
				new Product(123126, "item-6", 6000.00, ProductType.MOBILE),
				new Product(123124, "item-4", 4000.00, ProductType.TV));

		
		// ------------------------------------------------------
			// filter | limit | distinct , JDK 1.9 takeWhile  | dropWhile
		// ------------------------------------------------------
		
//		products.stream()
//		.distinct()

		

		// ------------------------------------------------------
			// map  | flatMap
		// ------------------------------------------------------

//		products
//		.stream()
//		.map(item->item.getName())
//		.forEach(System.out::println);
//		
//		
//		String[] menu= {"veg1,veg2","nveg1,nveg2,nveg3"};
//		
//		Stream
//		.of(menu)
//		.flatMap(item->Stream.of(item.split(",")))
//		.map(item->item.toUpperCase())
//		.forEach(System.out::println);
		
		

		// ------------------------------------------------------
			// sorted
		// ------------------------------------------------------
//		
//		products
//		.stream()
//		.sorted(Comparator.comparing(Product::getPrice, Double::compare))
//		.forEach(System.out::println);
		
		

		// ------------------------------------------------------
			// count | allMatch
		// ------------------------------------------------------
		
//		System.out.println(
//			products
//			.stream()
//			.filter(item->item.getType()==ProductType.MOBILE)
//			.count()
//	   );
		
		System.out.println(
				products
				.stream()
//				.allMatch(item->item.getPrice()>100)
//				.noneMatch(item->item.getPrice()<100)
				.anyMatch(item->item.getPrice()==1000.00)
		   );
		
//		System.out.println(
//				products
//				.stream()
//				.filter(item->item.getType()==ProductType.MOBILE)
//				.findFirst()
//				.get()
//		   );
		
		
//		
//		Object[] arr=products
//		.stream()
//		.filter(item->item.getType()==ProductType.MOBILE)
//		.toArray();
		
		
//		Product[] prodArr=
//		products
//		.stream()
//		.filter(item->item.getType()==ProductType.MOBILE)
//		//.toArray(size->new Product[size]);
//		.toArray(Product[]::new);
		
		
		
//		List<Product> list=
//		products
//		.stream()
//		.filter(item->item.getType()==ProductType.MOBILE)
//		.collect(Collectors.toList());
		
		
		
//		Map<ProductType, List<Product>> map=
//		products
//		.stream()
//		.collect(Collectors.groupingBy(item->item.getType()));
//		
//		System.out.println(map);
		
		
//		String[] menu= {"veg1,veg2","nveg1,nveg2,nveg3"};
//		
		
//		String newMenu=Stream
//		.of(menu)
//		.flatMap(item->Stream.of(item.split(",")))
//		.map(item->item.toUpperCase())
//		.collect(Collectors.joining(",", "{", "}"));
//		System.out.println(newMenu);
		
		
		

	}

}
