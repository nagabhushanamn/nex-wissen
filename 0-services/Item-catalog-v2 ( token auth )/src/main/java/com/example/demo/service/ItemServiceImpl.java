package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Item;
import com.example.demo.model.Review;
import com.example.demo.model.User;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.ReviewRepository;
import com.example.demo.repository.UserRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ReviewRepository reviewRepositoy;

	@Override
	public Review addNewReview(Review review, String itemId, String userId) {

		User user = userRepository.findByUsername(userId);
		Item item = itemRepository.findById(itemId).get();

		review.setItem(item);
		review.setUser(user);

		return reviewRepositoy.save(review);

	}
}
