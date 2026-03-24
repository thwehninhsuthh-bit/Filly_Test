package com.springboot.service;


class HomeTheaterFacade {

    
    private DVDPlayer dvdPlayer = new DVDPlayer();
    private Projector projector = new Projector();
    private Amplifier amplifier = new Amplifier();
    private Lights lights = new Lights();

    
    public void watchMovie(String movie) {

        System.out.println("\n=== Preparing Home Theater ===");

        lights.dim(30);
        projector.on();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    
    public void endMovie() {

        System.out.println("\n=== Shutting Down Home Theater ===");

        lights.dim(100);
        dvdPlayer.off();
        amplifier.off();
        projector.off();
    }
}