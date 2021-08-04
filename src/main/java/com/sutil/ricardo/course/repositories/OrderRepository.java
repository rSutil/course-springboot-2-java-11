package com.sutil.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutil.ricardo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
