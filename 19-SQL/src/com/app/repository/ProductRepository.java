package com.app.repository;

import java.util.List;

import com.app.model.Product;

public interface ProductRepository {

	void save(Product product);

	void findById(int id);

	void delete(int id);

	void update(int id, double price);

	List<Product> findAl();

	// .....

}
