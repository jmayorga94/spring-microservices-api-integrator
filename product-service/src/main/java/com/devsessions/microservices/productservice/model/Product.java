package com.devsessions.microservices.productservice.model;

import java.util.UUID;

import lombok.Data;

@Data
public class Product {
    
    public UUID id;
    public String name;

    public Product (String name)
    {
        this.id = UUID.randomUUID();
        name = this.name;
    }
}
