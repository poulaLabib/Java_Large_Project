package com.example.service;

public class SmsNotificationService implements Notifiable {
    @Override
    public void sendNotification(String recipient, String subject, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    @Override
    public boolean supportsChannel(String channel) {
        return "SMS".equalsIgnoreCase(channel);
    }
}
