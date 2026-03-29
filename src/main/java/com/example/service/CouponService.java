package com.example.service;

import com.example.model.Coupon;
import com.example.exception.ValidationException;
import java.math.BigDecimal;

public class CouponService {
    public BigDecimal applyCoupon(Coupon coupon, BigDecimal orderTotal) {
        if (!coupon.isValid()) {
            throw new ValidationException("Coupon " + coupon.getCode() + " is not valid");
        }
        coupon.use();
        BigDecimal discount = orderTotal.multiply(coupon.getDiscountPercent())
            .divide(BigDecimal.valueOf(100));
        return orderTotal.subtract(discount);
    }
}
