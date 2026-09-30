package com.example.GlobalExceltionHandller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class GlobalHandllerClass {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomResponse> handleE(Exception npe) {
		
		CustomResponse cr = new CustomResponse();
		
		cr.httpCode = 300;
		cr.msg = npe.getMessage();
		return ResponseEntity.internalServerError().body(cr);
		
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<CustomResponse> handleNPE(NullPointerException npe) {
		
		CustomResponse cr = new CustomResponse();
		
		cr.httpCode = 400;
		cr.msg = npe.getMessage();
		return ResponseEntity.internalServerError().body(cr);
		
	}
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<CustomResponse> handleAE(ArithmeticException npe) {
		
		CustomResponse cr = new CustomResponse();
		
		cr.httpCode = 200;
		cr.msg = npe.getMessage();
		return ResponseEntity.internalServerError().body(cr);
		
	}
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<CustomResponse> handleCE(CustomException npe) {
		
		CustomResponse cr = new CustomResponse();
		
		cr.httpCode = 200;
		cr.msg = npe.getMessage();
		return ResponseEntity.internalServerError().body(cr);
		
	}
	

	

}
