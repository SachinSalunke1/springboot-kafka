package com.startech.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    //logger slf4j used
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    //kafka listener test comment
    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message recieved -> %s", message));
    }
}
