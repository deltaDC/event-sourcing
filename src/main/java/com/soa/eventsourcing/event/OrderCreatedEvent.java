package com.soa.eventsourcing.event;

import com.soa.eventsourcing.aggregate.OrderDetails;
import io.eventuate.EventEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@EventEntity(entity = "com.soa.eventsourcing.aggregate.Order")
public class OrderCreatedEvent implements OrderEvent {

    private final OrderDetails orderDetails;

    public OrderCreatedEvent(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }
}
