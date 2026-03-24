package com.springboot.service;

public class PayPalAdapter implements PaymentProcessor  {

	private PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {

        this.payPalService = payPalService;

    }

    @Override
    public void pay(double amount) {

        System.out.println("Processing payment via PayPal Adapter...");

        payPalService.makePayment(amount);

    }
}
