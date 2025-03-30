package com.soa.eventsourcing;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class OrderDetails {

    private final String product;
    private final int quantity;
    private final double price;
}
