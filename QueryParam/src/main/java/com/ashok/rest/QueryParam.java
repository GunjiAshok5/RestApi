package com.ashok.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParam {

	// http://localhost:7070/course?cname=JRTP&tname=Ashok
	@GetMapping("/course")
	public String getCourseDetails(@RequestParam("cname") String courseName,
			@RequestParam("tname") String trainerName)
	{
		if(courseName.equals("JRTP") && trainerName.equals("Ashok"))
		{
			return "batch start soon ";
		}
		else {
			return " contact ashok it website";
		}
	}
}
