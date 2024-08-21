package com.indium.springbootjpaapp.lab03.service;

import com.indium.springbootjpaapp.lab03.entity.Summary;
import com.indium.springbootjpaapp.lab03.entity.Topic;
import com.indium.springbootjpaapp.lab03.exception.TopicAlreadyExistsException;
import com.indium.springbootjpaapp.lab03.exception.TopicNotFoundException;
import com.indium.springbootjpaapp.lab03.repository.SummaryRepository;
import com.indium.springbootjpaapp.lab03.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Primary
@Service
public class ConferenceService2 {
    @Autowired
    TopicRepository topicRepository;

    @Autowired
    SummaryRepository summaryRepository;

    @Transactional
    public void addTopic(String title, int duration) {
        if (topicRepository.findByTitle(title).isPresent()) {
            throw new TopicAlreadyExistsException(title);
        }
        Topic topic = new Topic();
        topic.setTitle(title);
        topic.setDuration(duration);
        topicRepository.save(topic);
        summaryRepository.incrementCount(duration);
        //incrementSummaryCountForDuration(duration);
    }

    private void incrementSummaryCountForDuration(int duration) {
        Optional<Summary> optionalSummary = summaryRepository.findByDuration(duration);
        Summary summary;
        if (optionalSummary.isPresent()) {
            summary = optionalSummary.get();
            summary.setCount(summary.getCount() + 1);
        } else {
            summary = new Summary();
            summary.setDuration(duration);
            summary.setCount(1);
        }
        summaryRepository.save(summary);
    }

    private void decrementSummaryCountForDuration(int duration) {
        Optional<Summary> optionalSummary = summaryRepository.findByDuration(duration);
        Summary summary;
        if (optionalSummary.isPresent()) {
            summary = optionalSummary.get();
            summary.setCount(summary.getCount() - 1);
            summaryRepository.save(summary);
        }

    }

    @Transactional
    public void removeTopic(String title) {
        Topic topic = topicRepository.findByTitle(title).orElseThrow(() -> new TopicNotFoundException(title));
//        topicRepository.delete(topic);
        topicRepository.removeTopicByTitle(title);
        summaryRepository.decrementCount(topic.getDuration());
//        decrementSummaryCountForDuration(topic.getDuration());
    }

    public List<String> getAllTitles() {
        return topicRepository.getAllTopicNames();
    }

    public List<Topic> getAllTopics() {
        return topicRepository.fetchAllTopics();
    }
}
