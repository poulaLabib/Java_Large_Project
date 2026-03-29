package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Order extends BaseEntity {
    private User user;
    private List<OrderItem> items = new ArrayList<>();
    private BigDecimal totalAmount;
    private OrderStatus status;
    private LocalDateTime orderDate;

    public Order() {
        this.orderDate = LocalDateTime.now();
        this.status = OrderStatus.PENDING;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; }
    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public void addItem(OrderItem item) {
        items.add(item);
        recalculateTotal();
    }

    private void recalculateTotal() {
        totalAmount = items.stream()
            .map(OrderItem::getSubtotal)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
