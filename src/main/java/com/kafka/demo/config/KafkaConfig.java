package com.kafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic myTopic() {
        // Topic Name, Partitions, Replication Factor
        return TopicBuilder.name("my_topic")
                .partitions(3) 
                .build();
    }
}
