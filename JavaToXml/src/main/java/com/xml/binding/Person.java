package com.xml.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@Data
@XmlRootElement
public class Person {

	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	
}
