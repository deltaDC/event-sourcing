package com.soa.eventsourcing;

import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEventHandlers
public class EventSourcingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventSourcingApplication.class, args);
    }

}
