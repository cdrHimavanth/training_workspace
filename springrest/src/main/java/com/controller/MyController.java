package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "one")
	public String sayHello() {
		return "Welcome to spring REST";
	}
	
	
	
}
