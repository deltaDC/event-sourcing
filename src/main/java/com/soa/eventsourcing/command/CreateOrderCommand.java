package com.soa.eventsourcing.command;

import com.soa.eventsourcing.aggregate.OrderDetails;
import lombok.Data;

@Data
public class CreateOrderCommand implements OrderCommand{

    private OrderDetails orderDetails;

    public CreateOrderCommand(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }
}
