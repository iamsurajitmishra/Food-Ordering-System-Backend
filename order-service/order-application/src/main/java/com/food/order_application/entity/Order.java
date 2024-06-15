package com.food.order_application.entity;

import com.food.common.domain.entity.AggregateRoot;
import com.food.common.domain.valueobject.OrderStatus;

import java.util.UUID;

public class Order extends AggregateRoot<UUID> {
    private UUID orderId;
    private OrderStatus orderStatus;
    public Order() {}
}
