package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.validator.UserValidator;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserValidator userValidator;

	/*
	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userForm", new User());

		return "registration";
	}
	*/

	@PostMapping("/register")
	public @ResponseBody String registration(@RequestBody User userForm, BindingResult bindingResult) {
		//userValidator.validate(userForm, bindingResult);

//		if (bindingResult.hasErrors()) {
//			return "registration";
//		}
		System.out.println(userForm);
		userService.save(userForm);
		
		return "registred";
	}

	/*
	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");
		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");
		return "login";
	}
	*/

	/*
	@GetMapping({ "/", "/welcome" })
	public String welcome(Model model) {
		return "welcome";
	}
	*/
}