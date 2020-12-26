package com.shiv.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(path = "/showMyLoginPage")
	public String showMyLoginPage() {
		
		return "fancy-login";
	}
	
	
	@GetMapping(path = "/access-denied")
	public String accessDenied() {
		System.out.println("access-denied");
		return "access-denied";
	}
}
