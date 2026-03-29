package com.example.model;

import java.math.BigDecimal;

public class PhysicalProduct extends Product {
    private double weightKg;
    private double lengthCm;
    private double widthCm;
    private double heightCm;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, String description, BigDecimal price, int quantity, double weightKg) {
        super(id, name, description, price, quantity);
        this.weightKg = weightKg;
    }

    public double getWeightKg() { return weightKg; }
    public void setWeightKg(double weightKg) { this.weightKg = weightKg; }
    public double getLengthCm() { return lengthCm; }
    public void setLengthCm(double lengthCm) { this.lengthCm = lengthCm; }
    public double getWidthCm() { return widthCm; }
    public void setWidthCm(double widthCm) { this.widthCm = widthCm; }
    public double getHeightCm() { return heightCm; }
    public void setHeightCm(double heightCm) { this.heightCm = heightCm; }

    public BigDecimal calculateShippingCost() {
        return BigDecimal.valueOf(weightKg * 2.5);
    }
}
