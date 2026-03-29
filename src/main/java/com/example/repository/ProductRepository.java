package com.example.repository;

import com.example.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long id);
    List<Product> findByCategory(Long categoryId);
    List<Product> findAll();
    Product save(Product product);
    void deleteById(Long id);
}
