package com.soa.eventsourcing;

import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;

import java.util.concurrent.CompletableFuture;

public class OrderService {

    private AggregateRepository<Order, OrderCommand> orderRepository;

    public OrderService(AggregateRepository<Order, OrderCommand> orderRepository) {
        this.orderRepository = orderRepository;
    }

    public CompletableFuture<EntityWithIdAndVersion<Order>> createOrder(OrderDetails orderDetails) {
        return orderRepository.save(new CreateOrder(orderDetails));
    }
}
