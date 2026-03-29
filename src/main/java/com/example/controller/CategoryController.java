package com.example.controller;

import com.example.model.Category;
import com.example.service.CategoryService;
import java.util.List;

public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Category getCategory(Long id) {
        return categoryService.getCategoryById(id);
    }

    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    public Category createCategory(String name, String description) {
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        return categoryService.createCategory(category);
    }
}
