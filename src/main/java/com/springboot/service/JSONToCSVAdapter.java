package com.springboot.service;

public class JSONToCSVAdapter implements DataReader{
	private JSONReader jsonReader;
	
	 public JSONToCSVAdapter(JSONReader jsonReader) {
	 this.jsonReader = jsonReader;
	}
	
	@Override
	 public void readData() {
	 
	 System.out.println("Converting JSON data to CSV format...");
	 jsonReader.readJSON();
	 }
}
