package com.training.model;

public class InvalidEmailException extends Exception {

	private String message;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	public InvalidEmailException(String message) {
		super();
		this.message = message;
	}
	
	

}
