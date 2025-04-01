package com.soa.eventsourcing.event;

import com.soa.eventsourcing.aggregate.OrderDetails;
import io.eventuate.EventEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
//@NoArgsConstructor
@Data
@EventEntity(entity = "com.soa.eventsourcing.aggregate.OrderAggregate")
public class OrderCreatedEvent implements OrderEvent {

    private final OrderDetails orderDetails;

    // Constructor
    public OrderCreatedEvent(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    // Getter
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }
}
