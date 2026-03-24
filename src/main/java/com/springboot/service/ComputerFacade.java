package com.springboot.service;

public class ComputerFacade {

	private CPU processor;
	 private Memory ram;
	 private HardDrive hdd;
	
	 public ComputerFacade() {
	 this.processor = new CPU();
	 this.ram = new Memory();
	 this.hdd = new HardDrive();
	 }
	
	 public void startComputer() {
	 System.out.println("Computer starting...");
	 processor.freeze();
	 ram.load(0, hdd.read(0, 1024));
	 processor.execute();
	 System.out.println("Computer started successfully!");
	 }
}
