package com.springboot.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class HelloSecurity {

	@GetMapping("/welcome")
	public String show() {
		return "<h1>welcome<h1>";
	}
}
