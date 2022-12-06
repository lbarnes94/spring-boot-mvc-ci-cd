package com.ab.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	
	@RequestMapping("/")
	public String home() {
		return "Welcome to Spring MVC using CI / CD Pipeline";
	}

}
