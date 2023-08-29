package com.exception.rest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NullPointer {

	@GetMapping("/welcome")
	public String welcome() {
		String s1=null;
		int length = s1.length();
		
		System.out.println(length);
		return s1;
		
	}
	
	@GetMapping("/greet")
	public String greet() {
		String s1="Good Morning Ashok !!!";
		int length = s1.length();
		
		System.out.println(length);
		return s1;
		
	}
	@ExceptionHandler(value=NullPointerException.class)
	public String NullExceptionHandle() {
		
		return "Null Error occured pls check once";
		
	}
	
}
