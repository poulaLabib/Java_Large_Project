package com.example.model;

public class Customer extends Person {
    private String shippingAddress;
    private String billingAddress;
    private int loyaltyPoints;

    public Customer() {}

    public Customer(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.loyaltyPoints = 0;
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
    public String getBillingAddress() { return billingAddress; }
    public void setBillingAddress(String billingAddress) { this.billingAddress = billingAddress; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }
}
