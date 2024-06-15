package com.food.orderdomaincore.valueObject;

import com.food.common.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {

    protected OrderItemId(Long value) {
        super(value);
    }
}
