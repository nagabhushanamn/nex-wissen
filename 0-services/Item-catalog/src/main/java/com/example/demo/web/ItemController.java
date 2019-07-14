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

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping
	public List<Item> getAll(Principal principal) {
		return itemRepository.findAll();
	}
	@GetMapping(value="/{item_id}/reviews")
	public List<Review> getAllItemReviews(@PathVariable(name="item_id") String itemId) {
		return reviewRepository.findAll(itemId);
	}
	@PostMapping(value="/{itemId}/reviews")
	public Review postNewReview(@PathVariable String itemId,@RequestBody Review review) {
		Item item=new Item();
		item.setId(itemId);
		review.setItem(item);
		return reviewRepository.save(review);
	}
	@PostMapping
	public ResponseEntity<?> createNew(@RequestBody Item item) {
		item=itemRepository.save(item);
		ResponseEntity<Item> responseEntity=new ResponseEntity<Item>(item, HttpStatus.CREATED);
		return responseEntity;
	}

}
