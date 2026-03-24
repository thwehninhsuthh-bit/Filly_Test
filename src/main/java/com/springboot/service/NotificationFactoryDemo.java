package com.springboot.service;

public class NotificationFactoryDemo {


 interface Notification {
     void notifyUser(String message);
 }


 static class EmailNotification implements Notification {
     public void notifyUser(String message) {
         System.out.println("Sending Email: " + message);
     }
 }

 static class SMSNotification implements Notification {
     public void notifyUser(String message) {
         System.out.println("Sending SMS: " + message);
     }
 }

 static class PushNotification implements Notification {
     public void notifyUser(String message) {
         System.out.println("Sending Push: " + message);
     }
 }

 
 static abstract class NotificationFactory {
     public abstract Notification createNotification();

    
     public void send(String message) {
         Notification notification = createNotification();
         notification.notifyUser(message);
     }
 }

 
 static class EmailFactory extends NotificationFactory {
     @Override
     public Notification createNotification() {
         return new EmailNotification();
     }
 }

 static class SMSFactory extends NotificationFactory {
     @Override
     public Notification createNotification() {
         return new SMSNotification();
     }
 }

 static class PushFactory extends NotificationFactory {
     @Override
     public Notification createNotification() {
         return new PushNotification();
     }
 }


 public static void main(String[] args) {

     NotificationFactory factory;

    
     factory = new EmailFactory();
     factory.send("Your order has been shipped!");

     
     factory = new SMSFactory();
     factory.send("Your verification code is 1234");

   
     factory = new PushFactory();
     factory.send("You have a new friend request!");
 }
}