package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
	

	@RequestMapping(value = "/products.htm",method=RequestMethod.GET)
	public @ResponseBody String getProducts() {
		return "GET : /products =>  ProductController :: getProducts()";
	}
	


}
