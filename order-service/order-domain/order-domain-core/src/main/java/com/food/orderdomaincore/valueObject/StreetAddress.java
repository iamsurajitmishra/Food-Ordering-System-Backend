package com.food.orderdomaincore.valueObject;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class StreetAddress {
    private final UUID id;
    private final String street;
    private final String postalCode;
    private final String city;

}
