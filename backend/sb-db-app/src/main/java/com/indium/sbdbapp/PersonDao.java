package com.indium.sbdbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

// Data access objects
// these classes contain code to perform CRUD operation on a specific table in DB
@Component
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertPerson(String name, int age) {
        jdbcTemplate.update("insert into persons(name, age) values(?, ?)", name, age);
    }

    public List<String> loadPersonNames() {
        String sql = "select name from persons";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public void deletePerson(int id) {
        jdbcTemplate.update("delete from persons where id = ?", id);
    }
}






