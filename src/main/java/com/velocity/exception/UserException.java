package com.velocity.exception;

public class UserException {

	private final String message;

	public UserException(String message) {
		super();
		this.message = message;
		System.out.println("Inside userexception constructor");
	}

	public String getMessage() {
		System.out.println("Inside getmessage()");
		return message;
		
	}

}
