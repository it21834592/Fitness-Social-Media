package com.social.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String homeControllerHandler() {
		return "This is Home Container";
	}
	
	@GetMapping("/home")
	public String homeControllerHandler2() {
		return "This is Home Container2";
	}
	
	//@PutMapping
	//@PostMapping
	//@DeleteMapping

}
