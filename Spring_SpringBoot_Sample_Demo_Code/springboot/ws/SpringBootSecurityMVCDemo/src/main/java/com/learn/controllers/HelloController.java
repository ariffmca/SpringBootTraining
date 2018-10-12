package com.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping("/")
	public String rootUrl() {
		return "This is authorzied and permitted to all";
	}
	
	@GetMapping("/rest/hello")
	public String hello() {
		return "This is authorzied and permitted only to role USER";
	}
	
	@GetMapping("/rest/helloadmin")
	public String helloAdmin() {
		return "This is authorzied and permitted only to role ADMIN";
	}
}
