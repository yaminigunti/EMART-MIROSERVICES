package com.cts.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.model.Payment;


public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	Optional<Payment> findById(int cardCode);

}
