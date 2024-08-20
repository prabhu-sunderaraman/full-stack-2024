package com.indium.springbootjpaapp;

import org.springframework.data.repository.CrudRepository;
// Spring Boot says don't implement a Dao.
// Instead you just define the Dao by specifying the Entity class name
// And the Primary key data type
// The implementation will be generated automatically

public interface PersonDao extends CrudRepository<Person, Integer> {
}
