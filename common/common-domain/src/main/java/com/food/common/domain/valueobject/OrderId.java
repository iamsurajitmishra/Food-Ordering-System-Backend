package com.food.common.domain.valueobject;

import java.util.UUID;

public abstract class OrderId extends BaseId<UUID>{
    public OrderId(UUID id) {
        super(id);
    }
}
