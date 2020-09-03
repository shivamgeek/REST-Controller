package com.shivam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shivam.entity.StudentErrorResponse;
import com.shivam.entity.StudentException;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentException e) {
		
		StudentErrorResponse error = new StudentErrorResponse();
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND); 
		
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleAllException(Exception e) {
		
		StudentErrorResponse error = new StudentErrorResponse();
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.BAD_REQUEST); 
		
	}
	
}
