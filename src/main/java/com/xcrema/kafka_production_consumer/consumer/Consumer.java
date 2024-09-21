package com.xcrema.kafka_production_consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = {"names"}, groupId = "abc")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
