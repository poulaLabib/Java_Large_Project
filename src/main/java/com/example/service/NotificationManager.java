package com.example.service;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private final List<Notifiable> channels = new ArrayList<>();

    public void registerChannel(Notifiable channel) {
        channels.add(channel);
    }

    public void notifyAll(String recipient, String subject, String message) {
        for (Notifiable channel : channels) {
            channel.sendNotification(recipient, subject, message);
        }
    }

    public void notifyViaChannel(String channelName, String recipient, String subject, String message) {
        channels.stream()
            .filter(c -> c.supportsChannel(channelName))
            .findFirst()
            .ifPresent(c -> c.sendNotification(recipient, subject, message));
    }
}
