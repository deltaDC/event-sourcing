package com.soa.eventsourcing.aggregate;

import com.soa.eventsourcing.command.CreateOrderCommand;
import com.soa.eventsourcing.command.OrderCommand;
import com.soa.eventsourcing.event.OrderCreatedEvent;
import io.eventuate.Event;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.Collections;
import java.util.List;

public class Order extends ReflectiveMutableCommandProcessingAggregate<Order, OrderCommand> {

    private OrderDetails orderDetails;

    public List<Event> process(CreateOrderCommand command) {
        return Collections.singletonList(new OrderCreatedEvent(command.getOrderDetails()));
    }

    public void apply(OrderCreatedEvent event) {
        this.orderDetails = event.getOrderDetails();
    }
}
