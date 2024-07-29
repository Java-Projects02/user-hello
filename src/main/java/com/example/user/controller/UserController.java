package com.example.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/")
	public String context() {
		logger.info("**context method**");
		return "Application index api";
	}
	
	@GetMapping("/hello")
	public String hello(){
		logger.info("**hello method**");
		return "Welcome to Spring Boot!";
	}

}
