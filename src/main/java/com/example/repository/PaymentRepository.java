package com.example.repository;

import com.example.model.Payment;
import java.util.List;
import java.util.Optional;

public interface PaymentRepository {
    Optional<Payment> findById(Long id);
    Optional<Payment> findByOrderId(Long orderId);
    List<Payment> findAll();
    Payment save(Payment payment);
}
