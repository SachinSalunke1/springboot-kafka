package com.startech.springbootkafka.kafka;

import com.startech.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    //logger used SLF4J
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    //prefix the class name to identify springboot for the configuration
    private KafkaTemplate<String, User> userKafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> userKafkaTemplate) {
        this.userKafkaTemplate = userKafkaTemplate;
    }

    public void sendMessage(User data){
        LOGGER.info(String.format("Message sent -> %s ",data.toString()));
        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"javaguides_json")
                .build();
        userKafkaTemplate.send(message);
    }
}
