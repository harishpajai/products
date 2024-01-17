package com.example.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.entities.ProductEntity;
import com.example.products.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping()
	public Object getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public Object getProductsById(@PathVariable long id ) {
		return productService.getProductsById(id);
	}
	
	@PostMapping()
	public Object saveProduct(@RequestBody ProductEntity entity) {
		return productService.saveProduct(entity);
	}
	
	@PutMapping()
	public Object updateProduct(@RequestBody ProductEntity entity) {
		return productService.updateProduct(entity);
	}
	
	@DeleteMapping("/{id}")
	public Object deleteProduct(@PathVariable long id ) {
		return productService.deleteProduct(id);
	}
}
