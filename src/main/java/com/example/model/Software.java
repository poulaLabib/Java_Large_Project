package com.example.model;

import java.math.BigDecimal;

public class Software extends DigitalProduct {
    private String version;
    private String licenseKey;
    private String platform;

    public Software() {}

    public Software(Long id, String name, String description, BigDecimal price, String version, String platform) {
        super(id, name, description, price);
        this.version = version;
        this.platform = platform;
        setFileFormat("EXE");
    }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public String getLicenseKey() { return licenseKey; }
    public void setLicenseKey(String licenseKey) { this.licenseKey = licenseKey; }
    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }
}
