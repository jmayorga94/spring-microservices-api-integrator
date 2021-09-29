package com.devsessions.microservices.ordersservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.devsessions.microservices.ordersservice.model.Order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class OrderController {
    

    @ApiOperation (value = "GetAll", notes = "get all orders")
    @GetMapping("/orders")

    public List<Order> getAllOrders() {
        
        List<Order> localOrdersDb = new ArrayList<>();
 
        localOrdersDb.add(new Order(3,300));
        localOrdersDb.add(new Order(4,400));
     
        return localOrdersDb;
     }
}
