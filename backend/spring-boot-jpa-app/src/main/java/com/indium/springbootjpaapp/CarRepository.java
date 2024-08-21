package com.indium.springbootjpaapp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Integer> {
    // Find all the BMW cars
    // Find all the cars with year as 2023
    // Find the model of all the cars

    // findAllByPropertyNames
    // findByPropertyNames
    List<Car> findAllByModel(String model);

    List<Car> findAllByYearOfMake(int year);

    List<Car> findAllByModelAndYearOfMake(String model, int year);

    List<Car> findAllByYearOfMakeAndModel(int year, String model);

    List<Car> findAllByYearOfMakeBetween(int start, int end);

    Car findByIdAndYearOfMakeAndModel(int id, int year, String model);

//     ERROR; Container doesn't know how to generate an implementation because it doesn't follow the convention
//    List<Car> getAllTheCarsWithYearGt(int year);
}
