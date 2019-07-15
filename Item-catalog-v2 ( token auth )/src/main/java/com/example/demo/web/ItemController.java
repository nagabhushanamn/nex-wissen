package com.example.demo.web;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.model.Review;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.ReviewRepository;
import com.example.demo.service.ItemService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private ReviewRepository reviewRepository;

	@Autowired
	private ItemService itemService;

	@GetMapping
	public List<Item> getAll() {
		return itemRepository.findAll();
	}

	@GetMapping(value = "/{itemId}/reviews")
	public List<Review> getAllItemReviews(@PathVariable String itemId) {
		return reviewRepository.findAll(itemId);
	}

	@PostMapping(value = "/{itemId}/reviews")
	public Review postNewReview(@PathVariable String itemId, @RequestBody Review review) {

		SecurityContext securityContext = SecurityContextHolder.getContext();
		String userId = securityContext.getAuthentication().getName();

		return itemService.addNewReview(review, itemId, userId);

	}

	@PostMapping
	public ResponseEntity<?> createNew(@RequestBody Item item) {
		item = itemRepository.save(item);
		ResponseEntity<Item> responseEntity = new ResponseEntity<Item>(item, HttpStatus.CREATED);
		return responseEntity;
	}

}
