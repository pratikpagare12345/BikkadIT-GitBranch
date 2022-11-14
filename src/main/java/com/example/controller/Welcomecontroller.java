package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Welcomecontroller {

	@GetMapping("/welcome")
	public String welcome() {
		
		
		String msg="Welcome Controller Created";
		return msg;
	}
}
