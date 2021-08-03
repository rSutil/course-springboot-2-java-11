package com.sutil.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutil.ricardo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
