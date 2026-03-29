package com.example.repository;

import com.example.model.Order;
import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(Long id);
    List<Order> findByUserId(Long userId);
    List<Order> findAll();
    Order save(Order order);
    void deleteById(Long id);
}
