package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dto.ProductDTO;
import com.rest.entity.Product;
import com.rest.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    
    @GetMapping(value="/getId/{id}",
    		produces= {"application/json","application/xml"}
    		)
    public Optional<Product> getProductId(@PathVariable Integer id) {
    	
    	 Optional<Product> productId = service.getProductId(id);
    	 
    	 return productId;
    }
    
    
    
    
	@GetMapping(value="/retrival",
			produces= {"application/json","application/xml"}
			)
	public ResponseEntity<List<Product>> retrieveall() {
		 List<Product> retrivalAll = service.retrivalAll();
		return new ResponseEntity<>(retrivalAll,HttpStatus.OK);  
	}
	
	
	
	
	
	@PostMapping(value="/insert",
			produces= {"application/json","application/xml"},
			consumes= {"application/json","application/xml"}
			)
	public ResponseEntity<String> insertProduct(@RequestBody ProductDTO productdto) {
		 String insertProduct = service.insertProduct(productdto);
		return new ResponseEntity<>(insertProduct,HttpStatus.CREATED);
	}
	
	
	
	@PutMapping(value="/update",
			produces= {"application/json","application/xml"},
			consumes= {"application/json","application/xml"}
			
			)
	public ResponseEntity<String>   updateProduct(@RequestBody ProductDTO productdto) {
		 String updateProduct = service.updateProduct(productdto);
		 return new ResponseEntity<>(updateProduct,HttpStatus.OK);
		 
	}
	
	
	@DeleteMapping(value="/delete/{id}",
			produces= {"application/json","application/xml"},
			consumes= {"application/json","application/xml"}
			)
	public ResponseEntity<String> deleteProduct(@PathVariable  Integer id) {
		 String deleteProduct = service.deleteProduct(id);
		 return new ResponseEntity<>(deleteProduct,HttpStatus.OK);
	}
}
