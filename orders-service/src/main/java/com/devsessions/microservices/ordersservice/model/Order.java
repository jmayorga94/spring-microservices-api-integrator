package com.devsessions.microservices.ordersservice.model;

import java.util.UUID;

import lombok.Data;

@Data
public class Order {
    public UUID orderNumber;
    public Integer numberOfItems;
    public int totalAmount;


    public Order(int numberOfItems, int totalAmount ){
        this.numberOfItems = numberOfItems;
        this.totalAmount = totalAmount;
        this.orderNumber = UUID.randomUUID();
    }
}
