package com.onlinevegetableshopping.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	
	
	@ExceptionHandler(NoSuchFeedbackException.class)
	public ResponseEntity<Object> handleNoSuchFeedbackException() {
		LOG.error("handleNoSuchFeedbackException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This Feedback is not present in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException() {
	LOG.error("handleUserNotFoundException");
	return new ResponseEntity<Object>("User not found this login id, Please enter the correct id.", HttpStatus.BAD_REQUEST);
	}
	
}