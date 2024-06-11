package com.food.orderdomaincore.valueObject;

import com.food.commondomain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    protected TrackingId(UUID value) {
        super(value);
    }
}
