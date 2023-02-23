package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	String str="Karthik";
	
	@GetMapping("/")
	public String getName() {
		return "Welcome "+str+" !";
	}
	String str1="Green";
	@GetMapping("/game")
	public String getMyFav() {
		return "My favourite color is "+str1;
	}
}
