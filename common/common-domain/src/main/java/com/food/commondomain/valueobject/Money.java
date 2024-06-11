package com.food.commondomain.valueobject;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode
public class Money {
    private final BigDecimal amount;
    public Money(BigDecimal amount) {
        this.amount = amount;
    }
    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero() {
        return this.amount!= null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        return this.amount!=null && this.amount.compareTo(money.getAmount()) > 0;
    }

    //To add money
    public Money add(Money money) {
        return new Money(setScale(this.amount.add(money.getAmount())));
    }

    //To substract money
    public Money subtract(Money money) {
        return new Money(setScale(this.amount.subtract(money.getAmount())));
    }

    //To multiply
    public Money multiply(int multiplier) {
        return new Money(setScale(this.amount.multiply(new BigDecimal(multiplier))));
    }



    private BigDecimal setScale(BigDecimal amount) {
        return amount.setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
