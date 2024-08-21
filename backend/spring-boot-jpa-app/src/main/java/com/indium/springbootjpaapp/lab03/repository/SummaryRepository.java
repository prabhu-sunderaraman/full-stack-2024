package com.indium.springbootjpaapp.lab03.repository;

import com.indium.springbootjpaapp.lab03.entity.Summary;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SummaryRepository extends CrudRepository<Summary, Integer> {

    Optional<Summary> findByDuration(int duration);
}
