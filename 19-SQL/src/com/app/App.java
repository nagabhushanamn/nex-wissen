package com.app;

import com.app.model.Product;
import com.app.model.ProductType;
import com.app.repository.JdbcProductRepository;
import com.app.repository.ProductRepository;

public class App {

	public static void main(String[] args) {

		ProductRepository productRepository = new JdbcProductRepository();

//		Product product = new Product("Laptop", 198000.00, ProductType.ELEC);
		Product product = new Product("mobile", 18000.00, ProductType.ELEC);
		productRepository.save(product);
		
		productRepository.findAll()
		.forEach(System.out::println);
		

	}

}
