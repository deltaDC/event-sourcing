package com.soa.eventsourcing;

public class CreateOrder implements OrderCommand{

    private OrderDetails orderDetails;

    public CreateOrder(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }
}
