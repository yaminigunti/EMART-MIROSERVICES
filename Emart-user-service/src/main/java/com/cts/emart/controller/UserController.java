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

import com.cts.emart.model.Users;
import com.cts.emart.service.UserService;



@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("/users")
	List<Users> getAllUsers() {
		return service.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody Users user) {
		service.addUser(user);
	}
	
	@RequestMapping("/users/login/{id}")
	Optional<Users> getUserDetailsByID(@PathVariable int id) {
		return service.getUserDetailsByID(id);
	}
	
	
	
}
