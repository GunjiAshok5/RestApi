package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.book.entity.Book;
@RepositoryRestController(path="books")
public interface BookRepository extends JpaRepository<Book, Integer> {

	
   
}
