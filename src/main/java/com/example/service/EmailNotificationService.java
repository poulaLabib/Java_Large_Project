package com.example.service;

public class EmailNotificationService implements Notifiable {
    private final EmailService emailService;

    public EmailNotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void sendNotification(String recipient, String subject, String message) {
        System.out.println("Sending email to " + recipient + " - Subject: " + subject);
    }

    @Override
    public boolean supportsChannel(String channel) {
        return "EMAIL".equalsIgnoreCase(channel);
    }
}
