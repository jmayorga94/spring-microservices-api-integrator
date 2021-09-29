package com.devsessions.microservices.productservice.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.devsessions.microservices.productservice.model.*;
import io.swagger.annotations.ApiOperation;

@RestController
public class ProductController {
    
    @ApiOperation (value = "GetAll", notes = "get all products")
    @GetMapping("/products")

    public List<Product> all() {
        
        List<Product> localProductsDb = new ArrayList<>();
 
        localProductsDb.add(new Product("Macbook 2021"));
        localProductsDb.add(new Product("Iphone 13"));
     
        return localProductsDb;
     }

    
}
