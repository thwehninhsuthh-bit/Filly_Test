package com.springboot.service;

public class Main {

    public static void main(String[] args) {

        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Inception");

        System.out.println("\nWatching movie...\n");

        homeTheater.endMovie();
    }
}
