package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	@GetMapping
	public List<Item> getAll() {
		return itemRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<?> createNew(@RequestBody Item item) {
		item=itemRepository.save(item);
		ResponseEntity<Item> responseEntity=new ResponseEntity<Item>(item, HttpStatus.CREATED);
		return responseEntity;
	}

}
