package com.ashok.jsonConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		Student s=new Student();
		s.setStudentId(101);
		s.setStudentName("Ashok");
		s.setStudentSkill("Java");
		
		ObjectMapper mapper=new ObjectMapper();
		String jsonString=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
        System.out.println(jsonString);
	}

}
