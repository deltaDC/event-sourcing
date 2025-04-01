package com.soa.eventsourcing.command;

import com.soa.eventsourcing.aggregate.OrderDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
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
