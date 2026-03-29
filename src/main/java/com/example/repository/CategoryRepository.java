package com.example.repository;

import com.example.model.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(Long id);
    List<Category> findAll();
    Category save(Category category);
    void deleteById(Long id);
}
