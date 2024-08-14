package com.indium.sbdbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbDbAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbDbAppApplication.class, args);
    }

    @Autowired
    PersonDao personDao;

    @Override
    public void run(String... args) throws Exception {
//        personDao.insertPerson("John", 12);
//        personDao.insertPerson("Joe", 22);
//        personDao.loadPersonNames().forEach(System.out::println);
        personDao.deletePerson(1);
    }
}
