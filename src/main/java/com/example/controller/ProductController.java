package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import com.example.dto.ProductDto;
import java.util.List;

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Product getProduct(Long id) {
        return productService.getProductById(id);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public Product createProduct(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setQuantity(dto.getQuantity());
        return productService.createProduct(product);
    }

    public void deleteProduct(Long id) {
        productService.deleteProduct(id);
    }
}
