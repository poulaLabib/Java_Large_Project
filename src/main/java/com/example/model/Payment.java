package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment extends BaseEntity {
    private Order order;
    private BigDecimal amount;
    private PaymentMethod method;
    private String transactionId;
    private LocalDateTime paidAt;

    public Payment() {}

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public PaymentMethod getMethod() { return method; }
    public void setMethod(PaymentMethod method) { this.method = method; }
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public LocalDateTime getPaidAt() { return paidAt; }
    public void setPaidAt(LocalDateTime paidAt) { this.paidAt = paidAt; }
}
