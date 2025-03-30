package com.soa.eventsourcing;

import io.eventuate.EventHandlerContext;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;

@EventSubscriber(id = "orderServiceEventHandlers")
public class OrderServiceEventHandlers {

    @EventHandlerMethod
    public void handleOrderCreated(EventHandlerContext<OrderCreated> ctx) {
        OrderCreated event = ctx.getEvent();
        System.out.println("Received OrderCreatedEvent: " + event);
    }
}
