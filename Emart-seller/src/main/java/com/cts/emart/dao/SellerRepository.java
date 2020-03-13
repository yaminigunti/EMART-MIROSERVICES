package com.cts.emart.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.model.Sellers;

public interface SellerRepository extends CrudRepository<Sellers, String> {
	   

		Optional<Sellers> findById(int id);
}
