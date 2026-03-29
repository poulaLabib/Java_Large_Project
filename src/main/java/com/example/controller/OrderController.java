package com.example.controller;

import com.example.model.Order;
import com.example.model.OrderStatus;
import com.example.service.OrderService;
import java.util.List;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order getOrder(Long id) {
        return orderService.getOrderById(id);
    }

    public List<Order> getUserOrders(Long userId) {
        return orderService.getOrdersByUser(userId);
    }

    public Order createOrder(Order order) {
        return orderService.createOrder(order);
    }

    public Order updateStatus(Long orderId, OrderStatus status) {
        return orderService.updateOrderStatus(orderId, status);
    }
}
