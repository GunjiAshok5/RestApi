package com.rest.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Product {

	@javax.persistence.Id
	private Integer id;
	
	private String name;
	
	private Double price;
}
