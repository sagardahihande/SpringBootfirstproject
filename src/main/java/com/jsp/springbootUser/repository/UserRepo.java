package com.jsp.springbootUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootUser.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
