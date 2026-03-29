package com.example.exception;

public class OrderProcessingException extends RuntimeException {
    private final Long orderId;

    public OrderProcessingException(Long orderId, String message) {
        super(message);
        this.orderId = orderId;
    }

    public OrderProcessingException(Long orderId, String message, Throwable cause) {
        super(message, cause);
        this.orderId = orderId;
    }

    public Long getOrderId() { return orderId; }
}
