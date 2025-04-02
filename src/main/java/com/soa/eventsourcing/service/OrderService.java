package com.soa.eventsourcing.service;

import com.soa.eventsourcing.aggregate.Order;
import com.soa.eventsourcing.aggregate.OrderDetails;
import com.soa.eventsourcing.command.CreateOrderCommand;
import com.soa.eventsourcing.command.OrderCommand;
import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class OrderService {

    private final AggregateRepository<Order, OrderCommand> orderRepository;

    public OrderService(AggregateRepository<Order, OrderCommand> orderRepository) {
        this.orderRepository = orderRepository;
    }

    public CompletableFuture<EntityWithIdAndVersion<Order>> createOrder(OrderDetails orderDetails) {
        return orderRepository.save(new CreateOrderCommand(orderDetails));
    }
}
