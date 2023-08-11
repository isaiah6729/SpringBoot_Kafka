package com.example.Kafka_Project2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class listeners {

        @KafkaListener(topics = "isaiah", groupId = "group1")
        void listener(String data) {
            System.out.println("listener: " + data);
    }

}
