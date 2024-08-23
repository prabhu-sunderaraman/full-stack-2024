package com.indium.spring_boot_rest_api.lab05.controller;

import com.indium.spring_boot_rest_api.lab05.entity.Topic;
import com.indium.spring_boot_rest_api.lab05.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping
    public HttpEntity<Void> addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public HttpEntity<Iterable<Topic>> getTopics() {
        return new HttpEntity<>(topicService.getTopics());
    }

    @PatchMapping
    public HttpEntity<Void> updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public HttpEntity<Void> deleteTopic(@RequestBody Topic topic) {
        topicService.deleteTopic(topic);
        return ResponseEntity.noContent().build();
    }
}
