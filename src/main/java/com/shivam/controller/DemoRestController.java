package com.shivam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	//Setup "/test/hello" REST ENDPOINT 
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from REST controller";
	}
	
}
