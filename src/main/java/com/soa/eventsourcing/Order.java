package com.soa.eventsourcing;

import io.eventuate.Event;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.Collections;
import java.util.List;

public class Order extends ReflectiveMutableCommandProcessingAggregate<Order, OrderCommand> {

    private OrderDetails orderDetails;

    public List<Event> process(CreateOrder command) {
        return Collections.singletonList(new OrderCreated(command.getOrderDetails()));
    }

    public void apply(OrderCreated event) {
        this.orderDetails = event.getOrderDetails();
    }
}
