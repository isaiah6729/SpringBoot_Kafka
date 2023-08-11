package com.example.Kafka_Project2;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class message {

    private KafkaTemplate<String, String> kafkaTemplate;

    public message(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @PostMapping
    public void publish(@RequestBody request request) {
        kafkaTemplate.send("isaiah", request.message());
    }
}
