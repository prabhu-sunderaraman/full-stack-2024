package com.indium.sbdbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class CarDao {
    @Autowired
    private JdbcTemplate jdbcTemplate; // Facade class

    public void createCar(String model, int year) {
        jdbcTemplate.update("insert into cars(model, year) values(?, ?)", model, year);
    }

    public Car getCar(int id) {
        String sql = "select * from cars where id = ? LIMIT 1";
        Car car = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
                    Car carRow = new Car(rs.getInt("id"), rs.getString("model"), rs.getInt("year"));
                    return carRow;
                }
                , id);
        return car;
    }

    public List<Car> getAllCars() {
        String sql = "select * from car";
        List<Car> cars = jdbcTemplate.query(sql, (rs, rowNum) -> {
            Car carRow = new Car(rs.getInt("id"),
                    rs.getString("model"),
                    rs.getInt("year"));
            return carRow;
        });
        return cars;
    }
}
