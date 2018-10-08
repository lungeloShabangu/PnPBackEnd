package com.PnPbackEnd.crud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PnPbackEnd.crud.Entity.Products;
import com.PnPbackEnd.crud.repository.ProductRepository;

@RestController
@RequestMapping("/Products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepos;
	
	@GetMapping("/products")
	public List<Products> getProducts(){
		return productRepos.findAll();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Products> getProduct(@PathVariable Long id){
		return productRepos.findById(id);
	}
	
	@DeleteMapping("/products/{id}")
	public boolean deleteProduct(@PathVariable Long id){
		productRepos.deleteById(id);
		return true;
	}
	
	@PostMapping("/products/{id}")
	public Products addProduct(Products product) {
		return productRepos.save(product);
	}
	
	@PutMapping("/products/{id}")
	public Products updateProduct(Products product) {
		return productRepos.save(product);
	}
}
