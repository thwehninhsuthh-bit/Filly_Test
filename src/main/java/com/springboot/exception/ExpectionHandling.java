package com.springboot.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExpectionHandling {
@ExceptionHandler(CategoryNotFoundExpection.class)
	public ResponseEntity<ErrorResponse> handleCategoryException(CategoryNotFoundExpection ex,HttpServletRequest req){
		ErrorResponse response=new ErrorResponse(
				LocalDateTime.now(),
				ex.getMessage(),
				404,
				req.getRequestURI()
				
				);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		
		
	}
	
	
}
