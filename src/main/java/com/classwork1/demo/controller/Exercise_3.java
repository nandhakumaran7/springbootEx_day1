package com.classwork1.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_3 {
	@Value
	("${cal}")
	
	private String yourFavColor;
	@GetMapping("ex3")
	public String getMyFav() {
		return "My Favorite color is  "+yourFavColor;
	}
}
