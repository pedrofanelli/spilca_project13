package controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.PaymentDetails;
import services.PaymentService;

@RestController
public class PaymentController {

	private static Logger logger = Logger.getLogger(PaymentController.class.getName());
	
	private final PaymentService paymentService;
	
	// DI
	public PaymentController(
			PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	/*
	 * We can handle the exceptions with a try and catch directly in the mapping, or 
	 * using some ASPECTS, let's do that.
	 * Here we only focus on the positive responses, then the negative on the aspects
	 */
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment(
			@RequestBody PaymentDetails paymentDetailss) {
		//PaymentDetails paymentDetails = paymentService.processPayment();
		
		logger.info("Recieved payment: "+paymentDetailss.getAmount());
		
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body(paymentDetailss);
	}
	
}
