package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping(value = "/hello.htm")
	public ModelAndView handleHelloReq(@RequestParam String name) {
		
		System.out.println("hello request received..");
		String helloResponse = "Hello " + name + "! welcome to spring web world";

		ModelAndView mav = new ModelAndView();
		mav.addObject("message", helloResponse);
		mav.setViewName("welcome");

		return mav;

	}

}
