package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Book_Table")
@Data
public class Book {

	@Id
	private Integer book_id;
	
	private String name;
	
	private Double price;
	
	
}
