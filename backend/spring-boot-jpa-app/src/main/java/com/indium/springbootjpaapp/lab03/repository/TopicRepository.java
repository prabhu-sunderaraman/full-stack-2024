package com.indium.springbootjpaapp.lab03.repository;

import com.indium.springbootjpaapp.lab03.entity.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
    Optional<Topic> findByTitle(String title);
    List<Topic> findAll();
}
