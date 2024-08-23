package com.indium.spring_boot_rest_api.lab05.service;

import com.indium.spring_boot_rest_api.lab05.entity.Topic;
import com.indium.spring_boot_rest_api.lab05.exception.TopicAlreadyExistsException;
import com.indium.spring_boot_rest_api.lab05.exception.TopicNotFoundException;
import com.indium.spring_boot_rest_api.lab05.repository.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicService {
    TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public void addTopic(Topic topic) {
        Optional<Topic> existingTopic = topicRepository.findByTitle(topic.getTitle());
        if (existingTopic.isPresent()) {
            throw new TopicAlreadyExistsException(topic.getTitle());
        }
        topicRepository.save(topic);
    }

    public Iterable<Topic> getTopics() {
        return topicRepository.findAll();
    }

    public void updateTopic(Topic topic) {
        Optional<Topic> existingTopic = topicRepository.findByTitle(topic.getTitle());
        if (!existingTopic.isPresent()) {
            throw new TopicNotFoundException(topic.getTitle());
        }
        topicRepository.save(existingTopic.get());
    }

    public void deleteTopic(Topic topic) {
        Optional<Topic> existingTopic = topicRepository.findByTitle(topic.getTitle());
        if (!existingTopic.isPresent()) {
            throw new RuntimeException("Topic does not exist");
        }
        topicRepository.delete(existingTopic.get());
    }

}
