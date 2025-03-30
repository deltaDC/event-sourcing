package com.soa.eventsourcing;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class OrderCreated implements OrderEvent {

    private final OrderDetails orderDetails;
}
