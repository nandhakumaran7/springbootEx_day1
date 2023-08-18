package com.classwork1.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_2 {
	@Value
	("${val}")
	
	private String studentName;
	@GetMapping("ex2")
	public String getName() {
		return "Welcome "+studentName+"!";
	}
}
