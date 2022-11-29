package com.startech.springbootkafka.config;

import com.startech.springbootkafka.kafka.JsonKafkaProducer;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides").build();
    }
    public void addNewMethodForGitTest1(){
        System.out.println("This method1 added from other user");
    }
    public void addNewMethodForGitTest2(){
        System.out.println("This method2 added from other user");
    }
    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }
}
