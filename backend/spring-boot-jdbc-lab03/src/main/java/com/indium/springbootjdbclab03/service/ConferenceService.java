package com.indium.springbootjdbclab03.service;

import com.indium.springbootjdbclab03.dao.TopicDao;
import com.indium.springbootjdbclab03.exception.TopicAlreadyExistsException;
import com.indium.springbootjdbclab03.exception.TopicNotFoundException;
import com.indium.springbootjdbclab03.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConferenceService {
    @Autowired
    TopicDao topicDao;

    @Transactional
    public void addTopic(String title, int duration) {
        if (topicDao.containsTopic(title)) {
            throw new TopicAlreadyExistsException(title);
        }
        // Sending an email
        topicDao.insert(title, duration);
        topicDao.incrementSummaryCount(duration);
    }

    @Transactional
    public void removeTopic(String title) {
        if (!topicDao.containsTopic(title)) {
            throw new TopicNotFoundException(title);
        }
        topicDao.removeTopic(title);
        //topicDao.decrementSummaryCount(duration); //Ignoring it as it involves a bit more coding! Lazy programmer!
    }

    public List<Topic> getAllTopics() {
        return topicDao.getTopics();
    }
}
