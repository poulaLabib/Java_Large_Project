package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Coupon extends BaseEntity {
    private String code;
    private BigDecimal discountPercent;
    private LocalDateTime expiresAt;
    private int maxUses;
    private int currentUses;

    public Coupon() {}

    public Coupon(String code, BigDecimal discountPercent, LocalDateTime expiresAt, int maxUses) {
        this.code = code;
        this.discountPercent = discountPercent;
        this.expiresAt = expiresAt;
        this.maxUses = maxUses;
        this.currentUses = 0;
    }

    public boolean isValid() {
        return currentUses < maxUses && expiresAt.isAfter(LocalDateTime.now());
    }

    public void use() {
        if (!isValid()) throw new IllegalStateException("Coupon is no longer valid");
        currentUses++;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public BigDecimal getDiscountPercent() { return discountPercent; }
    public void setDiscountPercent(BigDecimal discountPercent) { this.discountPercent = discountPercent; }
    public LocalDateTime getExpiresAt() { return expiresAt; }
    public void setExpiresAt(LocalDateTime expiresAt) { this.expiresAt = expiresAt; }
    public int getMaxUses() { return maxUses; }
    public void setMaxUses(int maxUses) { this.maxUses = maxUses; }
    public int getCurrentUses() { return currentUses; }
    public void setCurrentUses(int currentUses) { this.currentUses = currentUses; }
}
