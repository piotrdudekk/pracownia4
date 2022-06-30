package pl.pdudek.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    public String getCurrentLimit;
    private BigDecimal initialLimit;

    public void assignLimit(BigDecimal initialLimit) {
        this.initialLimit = initialLimit;
    }

    public BigDecimal getBalance() {
        return BigDecimal.valueOf(1000);
    }
}
