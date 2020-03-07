package com.cts.emart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.emart.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	    User findByUsername(String username);
}
