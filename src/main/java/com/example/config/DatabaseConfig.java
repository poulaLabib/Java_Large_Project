package com.example.config;

public class DatabaseConfig {
    private String url;
    private String username;
    private String password;
    private int maxPoolSize;

    public DatabaseConfig() {
        this.url = AppConfig.getProperty("db.url");
        this.username = AppConfig.getProperty("db.username");
        this.password = AppConfig.getProperty("db.password");
        this.maxPoolSize = 10;
    }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public int getMaxPoolSize() { return maxPoolSize; }
    public void setMaxPoolSize(int maxPoolSize) { this.maxPoolSize = maxPoolSize; }
}
