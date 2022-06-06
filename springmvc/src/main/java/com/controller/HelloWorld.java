package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping(value="abc") //http://localhost:8080/name/abc
	public String myFunc(){
		return "success";
	}
	
	@RequestMapping(value="abc2") //http://localhost:8080/name/abc2
	public String myFunc2() {
		return "thankyou";
	}
}
