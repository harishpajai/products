package com.example.products.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.entities.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

	
}
