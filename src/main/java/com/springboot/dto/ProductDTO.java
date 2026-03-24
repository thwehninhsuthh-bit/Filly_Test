package com.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {

	private int id;
	private String name;
	private double price;
	private  String description;
	
	
	
	
}
