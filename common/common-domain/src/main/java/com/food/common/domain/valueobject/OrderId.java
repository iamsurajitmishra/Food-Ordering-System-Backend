package com.food.commondomain.valueobject;

import java.util.UUID;

public abstract class OrderId extends BaseId<UUID>{
    public OrderId(UUID id) {
        super(id);
    }
}
