package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

//	@GetMapping("/")
	public @ResponseBody String welcome() {
		return "Welcome to Txr-system";
	}
	
}
