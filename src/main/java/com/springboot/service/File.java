package com.springboot.service;

public class File  implements FileSystemItem{

	private String name;
	 private int size;
	
	 public File(String name, int size) {
	 this.name = name;
     this.size = size;
	 }
	
	 @Override
	 public String getName() {
	 return this.name;
	 }
	
	 @Override
	 public int getSize() {
	 System.out.println("File '" + name + "' size is " + size + " KB");
	 return this.size;
	}
}
