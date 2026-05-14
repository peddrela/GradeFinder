package com.GradeFinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Temp {

	@GetMapping("/hello")
	public String hello(){
		return "<h1>Hello</h1>";
	}
}
             
