package com.springboot.service;
import java.util.ArrayList;
import java.util.List;
public class Folder  implements FileSystemItem{

	private String name;
	 private List<FileSystemItem> children = new ArrayList<>();
	
	 public Folder(String name) {
	 this.name = name;
	 }
	public void add(FileSystemItem item) {
		 children.add(item);
		 }
		
		 public void remove(FileSystemItem item) {
		 children.remove(item);
		 }
		
		 @Override
		 public String getName() {
		 return this.name;
		 }
		
		 @Override
		 public int getSize() {
		 int totalSize = 0;
		 System.out.println("Calculating size for Folder '" + name + "'...");
		 for (FileSystemItem item : children) {
		 totalSize += item.getSize();
		 }
		 System.out.println("Total size for Folder '" + name + "' is " + totalSize + " KB");
		 return totalSize;
		 }
}
