package com.example;

import com.example.config.AppConfig;

public class Application {
    public static void main(String[] args) {
        System.out.println("Starting " + AppConfig.getProperty("app.name")
            + " v" + AppConfig.getProperty("app.version"));
        System.out.println("Application started successfully.");
    }
}
