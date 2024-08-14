package com.indium.sbdbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;

@SpringBootApplication
public class SbDbAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbDbAppApplication.class, args);
    }

    @Autowired
    PersonDao personDao;

    @Autowired
    CarDao carDao;

    @Override
    public void run(String... args) throws Exception {
//        carDao.createCar("BMW", 2020);
//        carDao.createCar("Lambo", 2023);
//        carDao.createCar("Audi", 2024);
        try {
            Car car = carDao.getCar(1);
            System.out.println(car);
            carDao.getAllCars().forEach(System.out::println);
        } catch(DataAccessException e) {
            System.out.println(e.getMessage());
        }


//        personDao.insertPerson("John", 12);
//        personDao.insertPerson("Joe", 22);
//        personDao.loadPersonNames().forEach(System.out::println);
//        personDao.deletePerson(1);

    }
}
