package com.springboot.service;

class MerchantFacade {

    private MerchantService merchantService = new MerchantService();
    private KYCService kycService = new KYCService();
    private AccountService accountService = new AccountService();
    private NotificationService notificationService = new NotificationService();


    public void onboardMerchant(String merchantName) {

        System.out.println("\n=== Merchant Onboarding Started ===");

        // Step 1: Validate Merchant KYC
        boolean isValid = kycService.validateMerchant(merchantName);

        if (!isValid) {
            System.out.println("KYC validation failed!");
            return;
        }

        // Step 2: Create Merchant
        merchantService.createMerchant(merchantName);

        // Step 3: Setup Merchant Account
        accountService.setupAccount(merchantName);

        // Step 4: Send Notification
        notificationService.sendNotification(merchantName);

        System.out.println("=== Merchant Onboarding Completed ===");
    }
}
