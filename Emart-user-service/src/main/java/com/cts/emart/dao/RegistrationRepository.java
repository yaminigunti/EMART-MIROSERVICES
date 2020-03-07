package com.cts.emart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.emart.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	    Registration findByUsername(String username);
	}


