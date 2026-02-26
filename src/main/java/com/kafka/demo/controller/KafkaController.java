package com.kafka.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.producer.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish")
    public String send(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Message sent to Kafka!";
    }
}
