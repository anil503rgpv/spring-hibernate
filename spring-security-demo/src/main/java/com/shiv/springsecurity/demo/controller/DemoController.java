package com.shiv.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping(path = "/")
	public String showHome() {
		System.out.println("testing");
		return "home";
	}
	
	@GetMapping(path = "/leaders")
	public String showLeaders() {
		System.out.println("leaders");
		return "leaders";
	}
	
	@GetMapping(path = "/systems")
	public String showSystems() {
		System.out.println("leaders");
		return "systems";
	}
	
	
}
