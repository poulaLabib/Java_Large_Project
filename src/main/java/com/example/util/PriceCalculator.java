package com.example.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {
    private static final BigDecimal TAX_RATE = new BigDecimal("0.10");

    public static BigDecimal calculateTax(BigDecimal amount) {
        return amount.multiply(TAX_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculateTotalWithTax(BigDecimal amount) {
        return amount.add(calculateTax(amount)).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal applyDiscount(BigDecimal amount, BigDecimal discountPercent) {
        BigDecimal discount = amount.multiply(discountPercent.divide(new BigDecimal("100")));
        return amount.subtract(discount).setScale(2, RoundingMode.HALF_UP);
    }
}
