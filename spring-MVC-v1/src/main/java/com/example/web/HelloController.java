package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello.htm",method=RequestMethod.GET)
	public ModelAndView handleHelloReq(@RequestParam String name) {
		System.out.println("hello request received..");
		String helloResponse = "Hello " + name + "! welcome to spring web world";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", helloResponse);
		mav.setViewName("welcome");
		return mav;
	}

}
