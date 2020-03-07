package com.cts.emart.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.model.Login;

public interface loginDAO extends CrudRepository <Login, String>
{
	Login findByUsername(String username);
}
