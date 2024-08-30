package com.indium.producerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/match")
    public String updateMatch(@RequestParam String matchId, @RequestParam String status) {
        kafkaTemplate.send("match-topic", matchId, status);
        return "Match with id " + matchId + " updated with status " + status;
    }
}
