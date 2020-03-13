package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Sellers;
import com.cts.emart.service.SellerService;



@RestController
@CrossOrigin
@RequestMapping("/sellers")
public class SellerController {
	@Autowired
	SellerService service;

	@RequestMapping("/sellers")
	List<Sellers> getAllUsers() {
		return service.getAllSellers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/sellers")
	void addSeller(@RequestBody Sellers seller) {
		service.addSeller(seller);
	}
	
	@RequestMapping("/sellers/login/{id}")
	Optional<Sellers> getSellerDetailsByID(@PathVariable int id) {
		return service.getSellerDetailsByID(id);
	}
	
	
	
}
