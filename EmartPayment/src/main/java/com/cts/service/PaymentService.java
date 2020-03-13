package com.cts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.PaymentRepository;
import com.cts.model.Payment;


@Service
public class PaymentService {
	@Autowired
	PaymentRepository repo;

	public List<Payment> getAllPayments() {
		

		return (List<Payment>)repo.findAll();
		
	}

	public void addPayment(Payment payment) {
		repo.save(payment);
		
	}

	




	

	



}
