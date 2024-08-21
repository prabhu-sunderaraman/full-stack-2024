package com.indium.springbootjpaapp.lab03.repository;

import com.indium.springbootjpaapp.lab03.entity.Topic;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
    Optional<Topic> findByTitle(String title);

    List<Topic> findAll();

    @Query(value = "FROM Topic")
    List<Topic> fetchAllTopics();

    @Query(value = "Select title from Topic")
    List<String> getAllTopicNames();

    @Modifying
    @Query(value = "delete from Topic t where t.title = :p1")
    void removeTopicByTitle(@Param("p1") String title);
}
