package com.springboot.service;

public class CMain {
	public static void main(String[] args) {
		
		 File file1 = new File("document.txt", 10);
		 File file2 = new File("image.jpg", 50);
		 File file3 = new File("archive.zip", 200);
		
		
		 Folder picturesFolder = new Folder("Pictures");
		 picturesFolder.add(file2);
		
		 Folder rootFolder = new Folder("Root");
		 rootFolder.add(file1);
		 rootFolder.add(picturesFolder);
		 rootFolder.add(file3);
		
		
		 System.out.println("-----------------");
		 System.out.println("Size of file1: " + file1.getSize() + " KB"); 
		
		 System.out.println("-----------------");
	 System.out.println("Total size of rootFolder: " + rootFolder.getSize() + " KB");
}
}
