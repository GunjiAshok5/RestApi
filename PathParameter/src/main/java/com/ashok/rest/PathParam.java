package com.ashok.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathParam {

	// http://localhost:7070/course/SBMS
	@GetMapping("/course/{course}")
	public String getCourseDetails(@PathVariable("course") String courseName)
			
	{
		if(courseName.equals("JRTP") )
		{
			return "duration is 90 days ";
		}
		else if(courseName.equals("SBMS")){
			return " course duration is 100 days";
		}else {
			return "please refer my website";
		}
	}
}
