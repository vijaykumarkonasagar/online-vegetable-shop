package com.onlinevegetableshopping.exception;

public class NoFeedbackFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String message;
	
	public NoFeedbackFound(String message) {
		super(message);
	}
}
