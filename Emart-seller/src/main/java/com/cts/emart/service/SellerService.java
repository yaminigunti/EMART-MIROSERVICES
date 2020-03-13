package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.dao.SellerRepository;
import com.cts.emart.model.Sellers;



@Service
public class SellerService {
	
	Sellers user;
	@Autowired
	SellerRepository repo;

	

	public void addSeller(Sellers seller) {
		repo.save(seller);
		
	}

	

	public List<Sellers> getAllSellers() {
		return (List<Sellers>)repo.findAll();
	}

	public Optional<Sellers> getSellerDetailsByID(int id) {
		return repo.findById(id);
	}

	

}





