package com.soa.eventsourcing.event_handler;

import com.soa.eventsourcing.event.OrderCreatedEvent;
import io.eventuate.EventHandlerContext;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;
import org.springframework.stereotype.Component;

@Component
@EventSubscriber(id = "orderServiceEventHandlers")
public class OrderServiceEventHandlers {

    @EventHandlerMethod
    public void handleOrderCreated(EventHandlerContext<OrderCreatedEvent> ctx) {
        OrderCreatedEvent event = ctx.getEvent();
        System.out.println("Received OrderCreatedEvent: " + event);
    }
}
