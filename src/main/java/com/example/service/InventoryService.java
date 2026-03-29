package com.example.service;

import com.example.model.Product;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryService {
    private final ProductService productService;

    public InventoryService(ProductService productService) {
        this.productService = productService;
    }

    public boolean isInStock(Long productId) {
        Product product = productService.getProductById(productId);
        return product.getQuantity() > 0;
    }

    public void reduceStock(Long productId, int quantity) {
        Product product = productService.getProductById(productId);
        if (product.getQuantity() < quantity) {
            throw new IllegalStateException("Insufficient stock for product: " + productId);
        }
        product.setQuantity(product.getQuantity() - quantity);
    }

    public List<Product> getLowStockProducts(int threshold) {
        return productService.getAllProducts().stream()
            .filter(p -> p.getQuantity() <= threshold)
            .collect(Collectors.toList());
    }
}
