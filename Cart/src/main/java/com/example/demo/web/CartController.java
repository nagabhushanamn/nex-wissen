package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ItemLine;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users/{user}/cart")
public class CartController {

	@Autowired
	private RedisTemplate<String, ItemLine> redisTemplate;

	private HashMap<Integer, ItemLine> cart = new HashMap<>();

	@PostMapping
	public ResponseEntity<ItemLine> add(@PathVariable String user, @RequestBody ItemLine itemLine) {
		HashOperations<String, String, ItemLine> hashOps = redisTemplate.opsForHash();
		hashOps.put(user, itemLine.getItem().getId(), itemLine);
//		cart.put(itemLine.getQty(), itemLine);
		return new ResponseEntity<ItemLine>(itemLine, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<?> get(@PathVariable String user) {
		HashOperations<String, Integer, ItemLine> hashOps = redisTemplate.opsForHash();
		List<ItemLine> itemLines = hashOps.values(user);
//		List<ItemLine> itemLines=cart.keySet()
		itemLines
		.stream()
		.map(key -> cart.get(key))
		.collect(Collectors.toList());
		return new ResponseEntity<>(itemLines, HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable String user) {
		redisTemplate.delete(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
