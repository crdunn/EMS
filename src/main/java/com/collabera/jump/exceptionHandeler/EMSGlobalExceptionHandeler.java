package com.collabera.jump.exceptionHandeler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class EMSGlobalExceptionHandeler {
	
	ExceptionResponse exceptionResponse = new ExceptionResponse();
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> handleEmployeeNotFound(){
		return null;
		
	}
}
