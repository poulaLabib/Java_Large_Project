package com.example.service;

public class EmailService {
    public void sendWelcomeEmail(String to, String username) {
        System.out.println("Sending welcome email to " + to + " for user " + username);
    }

    public void sendOrderConfirmation(String to, Long orderId) {
        System.out.println("Sending order confirmation to " + to + " for order #" + orderId);
    }

    public void sendShippingNotification(String to, Long orderId, String trackingNumber) {
        System.out.println("Sending shipping notification to " + to + " for order #" + orderId);
    }
}
