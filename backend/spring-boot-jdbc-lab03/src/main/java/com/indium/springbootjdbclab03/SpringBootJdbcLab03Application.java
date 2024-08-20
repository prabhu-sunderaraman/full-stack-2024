package com.indium.springbootjdbclab03;

import com.indium.springbootjdbclab03.model.Topic;
import com.indium.springbootjdbclab03.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcLab03Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcLab03Application.class, args);
    }

    @Autowired
    ConferenceService conferenceService;

    @Override
    public void run(String... args) throws Exception {
//        conferenceService.addTopic("RoR", 90);
//        conferenceService.addTopic("Scala tricks", 60);
//        conferenceService.addTopic("Goroutines", 90);
        conferenceService.removeTopic("RoR");
        List<Topic> topics = conferenceService.getAllTopics();
        topics.forEach(System.out::println);
    }
}
