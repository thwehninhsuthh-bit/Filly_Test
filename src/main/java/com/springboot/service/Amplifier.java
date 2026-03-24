package com.springboot.service;

class Amplifier {
 void on() { System.out.println("Amplifier ON"); }
 void setVolume(int level) { System.out.println("Setting volume to " + level); }
 void off() { System.out.println("Amplifier OFF"); }
}