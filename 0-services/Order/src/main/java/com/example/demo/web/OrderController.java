package com.example.demo.web;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ItemLine;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users/{user}/orders")
public class OrderController {

	private RestTemplate restTemplate= new RestTemplate();;

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping
	public ResponseEntity<?> get(@PathVariable String user) {
		return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.CREATED);
	}

	@PostMapping
	public ResponseEntity<?> newOrder(@PathVariable String user) {

	
		String url = "http://localhost:8082/api/v1/users/Nag/cart";
		ResponseEntity<ItemLine[]> responseEntity = restTemplate.getForEntity(url, ItemLine[].class);
		ItemLine[] itemLines = responseEntity.getBody();

		double totalAmount = 
				            Stream.of(itemLines)
				            .mapToDouble(line -> line.getItem().getPrice() * line.getQty())
				            .sum();

		/*
		 * 
		String txrApiUrl = "http://localhost:8084/api/txr";

		TxrRequest request = new TxrRequest();
		request.setFromAccNum("1");
		request.setToAccNum("2");
		request.setAmount(totalAmount);

		ResponseEntity<TxrResponse> responseEntity2 = restTemplate.postForEntity(txrApiUrl, request, TxrResponse.class);
		TxrResponse txrResponse = responseEntity2.getBody();

		if (txrResponse != null) {
			System.out.println("Txr success & placing new order");
		}
		
		*/

		Order order = new Order();
		order.setAmount(totalAmount);
		order.setOrderDate(new Date());
		order = orderRepository.save(order);

		restTemplate.delete(url);

		return new ResponseEntity<>(order, HttpStatus.CREATED);

	}

}
