package exceptionHandlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import exceptions.NotEnoughMoneyException;
import models.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(NotEnoughMoneyException.class)
	public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(NotEnoughMoneyException ex) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setMessage("No hay suficiente guita!!!"+ex.getMessage());
		return ResponseEntity
				.badRequest()
				.body(errorDetails);
	}
}
