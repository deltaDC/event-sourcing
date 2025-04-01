package com.soa.eventsourcing.aggregate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetails {

    private String product;
    private int quantity;
    private double price;
}
