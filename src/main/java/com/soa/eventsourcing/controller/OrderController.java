package com.soa.eventsourcing.controller;

import com.soa.eventsourcing.aggregate.OrderDetails;
import com.soa.eventsourcing.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrderDetails orderDetails) {
        orderService.createOrder(orderDetails);
        return ResponseEntity.ok("Order created successfully!");
    }
}

