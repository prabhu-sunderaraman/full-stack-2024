package com.indium.sbdbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createCar(String model, int year) {
        jdbcTemplate.update("insert into cars(model, year) values(?, ?)", model, year);
    }

    public Car getCar(int id) {
        String sql = "select * from cars where id = ? LIMIT 1";
        // We'll address this in a bit
        return null;
    }

    public List<Car> getAllCars() {
        String sql = "select * from cars";
        // We'll address this in a bit
        return null;
    }
}
