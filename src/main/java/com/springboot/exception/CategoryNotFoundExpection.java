package com.springboot.exception;

public class CategoryNotFoundExpection extends RuntimeException{
	
public CategoryNotFoundExpection(String message) {
	super(message);
}
}
