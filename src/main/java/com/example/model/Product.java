package com.example.model;

import java.math.BigDecimal;

public class Product extends BaseEntity {
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private Category category;

    public Product() {}

    public Product(Long id, String name, String description, BigDecimal price, int quantity) {
        setId(id);
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}
