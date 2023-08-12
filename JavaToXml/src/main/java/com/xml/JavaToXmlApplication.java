package com.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xml.binding.Person;

@SpringBootApplication
public class JavaToXmlApplication {

	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(JavaToXmlApplication.class, args);
		
		Person p=new Person();
		p.setId(101);
		p.setName("Gunji Ashok");
		p.setAge(28);
		
		
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = instance.createMarshaller();
		marshaller.marshal(p,new File("Person.xml"));
		
		System.out.println("Marshaller is completed....");
	}

}
