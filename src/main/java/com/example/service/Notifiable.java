package com.example.service;

public interface Notifiable {
    void sendNotification(String recipient, String subject, String message);
    boolean supportsChannel(String channel);
}
