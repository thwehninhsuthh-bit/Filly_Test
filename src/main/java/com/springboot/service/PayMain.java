package com.springboot.service;

public class PayMain {

	 public static void main(String[] args) {

         PaymentProcessor payment =
                 new PayPalAdapter(new PayPalService());

         payment.pay(100);
    }
}
