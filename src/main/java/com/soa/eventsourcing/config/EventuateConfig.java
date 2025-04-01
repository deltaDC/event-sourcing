package com.soa.eventsourcing.config;

import com.soa.eventsourcing.aggregate.Order;
import com.soa.eventsourcing.command.OrderCommand;
import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventuateConfig {

    @Bean
    public AggregateRepository<Order, OrderCommand> orderRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(Order.class, eventStore);
    }
}
