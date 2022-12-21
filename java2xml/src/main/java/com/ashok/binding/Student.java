package com.ashok.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Student {

	private Integer id;
	private String name;
	private Integer rank;
}
