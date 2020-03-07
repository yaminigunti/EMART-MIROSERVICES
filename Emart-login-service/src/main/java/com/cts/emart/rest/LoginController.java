package com.cts.emart.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Login;
import com.cts.emart.service.LoginService;

@RestController
@RequestMapping("/Login")
public class LoginController {
	
	@Autowired
	LoginService service;

	@RequestMapping("/user")
	Login getUser() {
		return service.getUser();
	}
	
	@RequestMapping("/all")
	List<Object> getAllUsers() {
			return service.getAllUsers();
	}
	
}
