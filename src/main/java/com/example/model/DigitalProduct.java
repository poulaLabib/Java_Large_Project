package com.example.model;

import java.math.BigDecimal;

public abstract class DigitalProduct extends Product {
    private String downloadUrl;
    private long fileSizeBytes;
    private String fileFormat;

    public DigitalProduct() {}

    public DigitalProduct(Long id, String name, String description, BigDecimal price) {
        super(id, name, description, price, Integer.MAX_VALUE);
    }

    public String getDownloadUrl() { return downloadUrl; }
    public void setDownloadUrl(String downloadUrl) { this.downloadUrl = downloadUrl; }
    public long getFileSizeBytes() { return fileSizeBytes; }
    public void setFileSizeBytes(long fileSizeBytes) { this.fileSizeBytes = fileSizeBytes; }
    public String getFileFormat() { return fileFormat; }
    public void setFileFormat(String fileFormat) { this.fileFormat = fileFormat; }
}
