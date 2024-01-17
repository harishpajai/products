package com.example.products.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.entities.ProductEntity;
import com.example.products.repo.ProductRepo;
import com.example.products.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public Object getProducts() {
		return productRepo.findAll();
	}

	@Override
	public Object saveProduct(ProductEntity entity) {
		return productRepo.save(entity);
	}

	@Override
	public Object updateProduct(ProductEntity entity) {
		return productRepo.save(entity);
	}

	@Override
	public Object deleteProduct(long id) {
		productRepo.deleteById(id);
		return 1;
	}

	@Override
	public Object getProductsById(long id) {
		return productRepo.findById(id);
	}

}
