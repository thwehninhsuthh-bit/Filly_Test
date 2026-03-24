package com.springboot.exception;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class SuccessResponse <T>{

	
	private String Message;
	
	private T object;
	
}
