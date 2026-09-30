package com.example.GlobalExceltionHandller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestExceptionController {
	
	
	@GetMapping("/NPE")
	public void NPEMethod() {
		
		
		String s =  null;
		
		s.length();
		
	}
	@GetMapping("/AE")
	public void ArithmeticExceptionMethod() {
		
		int a=10;
		int b = a/0;
		
	}
	@GetMapping("/CE")
	public void CustomeExceptionMethod() throws CustomException {
		
		throw new CustomException(" Age is not Valid");
		
	}
	
	@GetMapping("/GE")
	public void ExceptionMethod() throws Exception {
		
		throw new Exception(" This is generic Exception");
		
	}
	
	
	

}
