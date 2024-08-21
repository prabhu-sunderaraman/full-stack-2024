package com.indium.springbootjpaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootJpaAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaAppApplication.class, args);
    }

    @Autowired
    PersonDao personDao;

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {

//        Car car1 = new Car();
//        car1.setModel("Ferrari");
//        car1.setYearOfMake(2022);
//        carRepository.save(car1);

//        System.out.println(personDao.getClass().getName());
//        System.out.println(carRepository.getClass().getName());
//        Iterable<Car> cars = carRepository.findAll();
//        cars.forEach(System.out::println);

        carRepository.findAllByModel("BMW").forEach(System.out::println);
        carRepository.findAllByModelAndYearOfMake("Ferrari", 2022).forEach(System.out::println);
        carRepository.findAllByYearOfMake(2024).forEach(System.out::println);
        carRepository.findAllByYearOfMakeBetween(2000, 2024).forEach(System.out::println);

//        Person p = new Person();
//        p.setName("Mary");
//        p.setAge(26);
//        personDao.save(p);

//        System.out.println("Person with id: " + p.getId() + " inserted");

//        personDao.findAll().forEach(System.out::println);

//        Optional<Person> optionalPerson = personDao.findById(2);
//        if (optionalPerson.isPresent()) {
//            Person person = optionalPerson.get();
//            person.setAge(100);
//            personDao.save(person);
//        }
//
//        // Try to delete a person
//        Optional<Person> optionalPerson3 = personDao.findById(3);
//        if (optionalPerson3.isPresent()) {
//            Person person = optionalPerson3.get();
//            personDao.delete(person);
//        } else {
//            System.out.println("Person with id 3 is not found");
//        }

    }
}
