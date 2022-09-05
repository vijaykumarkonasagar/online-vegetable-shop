package com.onlinevegetableshopping.exception;

@SuppressWarnings("serial")
public class InvalidLoginCredentialsException extends Exception {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public InvalidLoginCredentialsException(String message) {
		super(message);
	}
}
