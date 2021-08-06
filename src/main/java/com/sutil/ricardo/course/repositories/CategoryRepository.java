package com.sutil.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutil.ricardo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
