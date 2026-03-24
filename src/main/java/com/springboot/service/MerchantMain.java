package com.springboot.service;

public class MerchantMain {

    public static void main(String[] args) {

        MerchantFacade merchantFacade = new MerchantFacade();

        merchantFacade.onboardMerchant("ABC Store");
    }
}