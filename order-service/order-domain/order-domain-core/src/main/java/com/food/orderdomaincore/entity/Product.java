package com.food.orderdomaincore.entity;

import com.food.commondomain.entity.BaseEntity;
import com.food.commondomain.valueobject.Money;
import com.food.commondomain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String productName;
    private Money price;
    public Product(ProductId productId,String productName,Money price) {
        super.setId(productId);
        this.productName = productName;
        this.price = price;
    }
}
