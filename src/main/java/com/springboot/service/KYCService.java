package com.springboot.service;

class KYCService {

    boolean validateMerchant(String name) {
        System.out.println("Validating KYC for merchant: " + name);
        return true; // assume KYC passed
    }
}