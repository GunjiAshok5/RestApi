package com.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dto.ProductDTO;
import com.rest.entity.Product;
import com.rest.repo.ProductRepo;
import com.rest.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	ProductRepo repo;
	
	@Override
	public List<Product> retrivalAll() {
		return repo.findAll();
		
	}

	@Override
	public String updateProduct(ProductDTO productdto) {
		Product p=new Product();
		p.setId(productdto.getId());
		p.setName(productdto.getP_name());
		p.setPrice(productdto.getP_price());
		if(repo.existsById(productdto.getId())) {
			repo.save(p);
			return "product updated successfully";
		}else {
			
			return "product Id not available...";
		}
			
	}

	@Override
	public String insertProduct(ProductDTO productdto) {
		Product p=new Product();
		p.setId(productdto.getId());
		p.setName(productdto.getP_name());
		p.setPrice(productdto.getP_price());
		if(repo.existsById(productdto.getId())) {
			
			return "product ID Already Available...";
		}else {
			repo.save(p);
			return "product Inserted";
		}
	}

	@Override
	public String deleteProduct(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "product Id deleted";
		}else {
			return "product id not available...";
		}
		
	}

	@Override
	public Optional<Product> getProductId(Integer id) {
		
		if(repo.existsById(id)) {
			 Optional<Product> findById = repo.findById(id);
			 return findById;
		}else {
			return null;
		}
		
		
	}
}
