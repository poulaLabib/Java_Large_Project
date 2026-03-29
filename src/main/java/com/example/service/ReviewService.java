package com.example.service;

import com.example.model.Review;
import com.example.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReviewService {
    private final List<Review> reviews = new ArrayList<>();

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviewsForProduct(Long productId) {
        return reviews.stream()
            .filter(r -> r.getProduct().getId().equals(productId))
            .collect(Collectors.toList());
    }

    public double getAverageRating(Long productId) {
        return getReviewsForProduct(productId).stream()
            .mapToInt(Review::getRating)
            .average()
            .orElse(0.0);
    }
}
