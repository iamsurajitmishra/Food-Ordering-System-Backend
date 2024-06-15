package com.food.orderdomaincore.entity;

import com.food.common.domain.entity.BaseEntity;
import com.food.common.domain.valueobject.Money;
import com.food.common.domain.valueobject.OrderId;
import com.food.orderdomaincore.valueObject.OrderItemId;
import lombok.Getter;

@Getter
public class OrderItem extends BaseEntity<OrderItemId> {
    private OrderId or;
    private final Product product;
    private final int quantity;
    private final Money unitPrice;
    private final Money totalPrice;

    private OrderItem(Builder builder) {
       super.setId(builder.orderItemId);
        product = builder.product;
        quantity = builder.quantity;
        unitPrice = builder.unitPrice;
        totalPrice = builder.totalPrice;
    }

    public static final class Builder {
        private OrderItemId orderItemId;
        private Product product;
        private int quantity;
        private Money unitPrice;
        private Money totalPrice;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder orderItemId(OrderItemId val) {
            orderItemId = val;
            return this;
        }

        public Builder product(Product val) {
            product = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder unitPrice(Money val) {
            unitPrice = val;
            return this;
        }

        public Builder totalPrice(Money val) {
            totalPrice = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
