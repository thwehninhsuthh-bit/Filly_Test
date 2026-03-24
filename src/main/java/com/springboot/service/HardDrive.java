package com.springboot.service;

public class HardDrive {

	public byte[] read(long lba, int size) {
		 System.out.println("HardDrive: Reading data...");
		 return new byte[size];
		 }
}
