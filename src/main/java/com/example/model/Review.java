package com.example.model;

public class Review extends BaseEntity {
    private User user;
    private Product product;
    private int rating;
    private String comment;

    public Review() {}

    public Review(User user, Product product, int rating, String comment) {
        this.user = user;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}
