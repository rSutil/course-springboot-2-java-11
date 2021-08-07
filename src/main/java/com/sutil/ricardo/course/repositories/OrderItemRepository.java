package com.sutil.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutil.ricardo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
