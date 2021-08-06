package com.sutil.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutil.ricardo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
