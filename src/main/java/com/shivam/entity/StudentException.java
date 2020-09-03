package com.shivam.entity;

public class StudentException extends RuntimeException {

	public StudentException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentException(String message) {
		super(message);
	}

	public StudentException(Throwable cause) {
		super(cause);
	}

	public StudentException() {
		super();
	}
	
}
