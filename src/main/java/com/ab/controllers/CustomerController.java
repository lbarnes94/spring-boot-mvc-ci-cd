package com.ab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Spring MVC using CI / CD Pipeline";
	}

}
