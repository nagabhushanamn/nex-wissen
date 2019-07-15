package com.example.demo.service;

import com.example.demo.model.Review;

public interface ItemService {
	public Review addNewReview(Review review, String itemId, String userId);
}
