package com.springboot.service;

public class AdapterMain {
 
	public static void main(String[] args) {
		
		 DataReader reader = new JSONToCSVAdapter(new JSONReader());
		
		
		 reader.readData();
		 }
}
