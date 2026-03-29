package com.example.config;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private static final Map<String, String> properties = new HashMap<>();

    static {
        properties.put("app.name", "E-Commerce Application");
        properties.put("app.version", "1.0.0");
        properties.put("db.url", "jdbc:h2:mem:testdb");
        properties.put("db.username", "sa");
        properties.put("db.password", "");
    }

    public static String getProperty(String key) {
        return properties.get(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return properties.getOrDefault(key, defaultValue);
    }
}
