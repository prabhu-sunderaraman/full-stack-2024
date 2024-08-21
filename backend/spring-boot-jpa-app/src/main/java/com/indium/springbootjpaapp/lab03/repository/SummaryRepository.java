package com.indium.springbootjpaapp.lab03.repository;

import com.indium.springbootjpaapp.lab03.entity.Summary;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SummaryRepository extends CrudRepository<Summary, Integer> {

    Optional<Summary> findByDuration(int duration);

    @Modifying
    @Query(value = "UPDATE Summary s SET s.count = s.count + 1 WHERE s.duration= :p1")
    void incrementCount(@Param("p1") int duration);

    @Modifying
    @Query(value = "UPDATE Summary s SET s.count = s.count - 1 WHERE s.duration= :p1 AND s.count != 0")
    void decrementCount(@Param("p1") int duration);
}
