package services;

import org.springframework.stereotype.Service;

import models.PaymentDetails;
import exceptions.NotEnoughMoneyException;

@Service
public class PaymentService {

	public PaymentDetails processPayment() {
		throw new NotEnoughMoneyException();
	}
}
