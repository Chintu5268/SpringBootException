package com.velocity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//step 1 @controllerAdvice annotation
@ControllerAdvice
public class UserHandlerException {

	// step 2 create method in which pass usernotfpoundexception 	
	@ExceptionHandler(value = {UserNotFoundException.class})
	public ResponseEntity<Object> handleUser (UserNotFoundException userNotFoundException) {
		System.out.println("Inside user handler line no 16");
		
		// step 3  create object od userexception class
		UserException userException = new UserException(userNotFoundException.getMessage());
		System.out.println("Inside user handler line no 18");
		// step 4  
		return new ResponseEntity<>(userException,HttpStatus.NOT_FOUND);
	}
}
