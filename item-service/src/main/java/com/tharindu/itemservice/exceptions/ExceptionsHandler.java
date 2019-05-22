package com.tharindu.itemservice.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMassage>  somethingWentWrong(Exception ex){
		
		ErrorMassage em = new ErrorMassage(ex.getMessage() , "something is wrong");
		
		return new ResponseEntity<ErrorMassage>(em,new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<ErrorMassage>  somethingWentWrong1(RuntimeException ex){
		
		ErrorMassage em = new ErrorMassage(ex.getMessage() , "something is wrong");
		
		return new ResponseEntity<ErrorMassage>(em,new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}

}
