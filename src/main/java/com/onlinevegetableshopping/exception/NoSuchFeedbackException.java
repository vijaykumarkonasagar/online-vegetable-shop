package com.onlinevegetableshopping.exception;

public class NoSuchFeedbackException extends Exception {
	
	public String message;
	
	public NoSuchFeedbackException(String message) {
		super(message);
	}

}
