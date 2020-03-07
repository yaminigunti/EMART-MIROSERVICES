package com.cts.emart.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.emart.model.Login;



@Service

public class LoginService {
	
	
	public Login getUser() {
		return new Login("userName","password");
	}

	public List<Object> getAllUsers() {
		String urlToHit = "http://localhost:7655/info/all";
		return  Arrays.asList(new RestTemplate().getForObject(urlToHit, Object[].class));
	}

	
}


