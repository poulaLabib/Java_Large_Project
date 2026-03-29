package com.example.controller;

import com.example.model.Payment;
import com.example.model.PaymentMethod;
import com.example.service.PaymentService;

public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public Payment processPayment(Long orderId, PaymentMethod method) {
        return paymentService.processPayment(orderId, method);
    }

    public Payment getPaymentByOrder(Long orderId) {
        return paymentService.getPaymentByOrderId(orderId);
    }
}
