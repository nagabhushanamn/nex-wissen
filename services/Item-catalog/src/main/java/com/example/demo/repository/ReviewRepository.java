package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Review;


public interface ReviewRepository extends JpaRepository<Review, Integer> {

	@Query("from Review rev where rev.item.id=:itemId")
	List<Review> findAll(String itemId);
	
}
