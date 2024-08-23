package com.indium.spring_boot_rest_api.lab05.repository;

import com.indium.spring_boot_rest_api.lab05.entity.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TopicRepository extends CrudRepository<Topic, String> {
    Optional<Topic> findByTitle(String title);
}
