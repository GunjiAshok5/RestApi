package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rest.dto.ProductDTO;
import com.rest.entity.Product;

@Service
public interface ProductService {

	public Optional<Product> getProductId(Integer id);
	
	public List<com.rest.entity.Product> retrivalAll();
	
	public String updateProduct(ProductDTO productdto);
	
	public String insertProduct(ProductDTO productdto);
	
	public String deleteProduct(Integer id);
	
}
