package com.springboot.service;

public class Singleton {

	
	private static Singleton instance;
	private Singleton() {
		System.out.print("Singleton initiallized");
		
	}
	public static Singleton getInstance() {
		
		if (instance == null) {
			instance = new Singleton();
			
		}
		return instance;
	}
	public void log(String message) {
		System.out.println ("Log:"+ message);
		
	}
	
	
	
}
