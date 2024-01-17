package com.example.products.services;

import org.springframework.stereotype.Service;

import com.example.products.entities.ProductEntity;


public interface ProductService {

	public Object getProducts();
	public Object saveProduct(ProductEntity entity);
	public Object updateProduct(ProductEntity entity);
	public Object deleteProduct(long id);
	public Object getProductsById(long id);
}
