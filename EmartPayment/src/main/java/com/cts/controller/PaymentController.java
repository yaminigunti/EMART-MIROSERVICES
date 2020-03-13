package com.cts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Payment;
import com.cts.service.PaymentService;

@RestController
@CrossOrigin

public class PaymentController {
	
	@Autowired
	PaymentService service;

	@RequestMapping("/payments")
	List<Payment> getAllPayments() {
		return service.getAllPayments(); 
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/payments")
	void addPayment(@RequestBody Payment payment) {
		service.addPayment(payment);
	}
	

	
}
