package com.food.commondomain.valueobject;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class BaseId<T> {
    private final T value;
    protected BaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
