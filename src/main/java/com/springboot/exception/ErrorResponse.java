package com.springboot.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {

	private LocalDateTime dateTime;
	private String errorMessage;
	private int status;
	private String path;
	
}
