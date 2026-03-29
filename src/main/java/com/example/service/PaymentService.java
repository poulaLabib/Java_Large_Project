package com.example.service;

import com.example.model.Payment;
import com.example.model.Order;
import com.example.model.PaymentMethod;
import com.example.repository.PaymentRepository;
import com.example.exception.ResourceNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final OrderService orderService;

    public PaymentService(PaymentRepository paymentRepository, OrderService orderService) {
        this.paymentRepository = paymentRepository;
        this.orderService = orderService;
    }

    public Payment processPayment(Long orderId, PaymentMethod method) {
        Order order = orderService.getOrderById(orderId);
        Payment payment = new Payment();
        payment.setOrder(order);
        payment.setAmount(order.getTotalAmount());
        payment.setMethod(method);
        payment.setPaidAt(LocalDateTime.now());
        payment.setTransactionId(generateTransactionId());
        return paymentRepository.save(payment);
    }

    public Payment getPaymentByOrderId(Long orderId) {
        return paymentRepository.findByOrderId(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Payment not found for order: " + orderId));
    }

    private String generateTransactionId() {
        return "TXN-" + System.currentTimeMillis();
    }
}
