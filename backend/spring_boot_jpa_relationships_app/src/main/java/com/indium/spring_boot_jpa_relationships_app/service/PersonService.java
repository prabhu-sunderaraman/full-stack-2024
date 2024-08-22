package com.indium.spring_boot_jpa_relationships_app.service;

import com.indium.spring_boot_jpa_relationships_app.entity.Car;
import com.indium.spring_boot_jpa_relationships_app.entity.Person;
import com.indium.spring_boot_jpa_relationships_app.repository.CarRepository;
import com.indium.spring_boot_jpa_relationships_app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    CarRepository carRepository;

    @Transactional
    public void savePersonWith2Cars() {
        Person person1 = new Person();
        person1.setName("Sam");
        person1.setAge(40);
        personRepository.save(person1);

        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setYear(2020);
        car1.setOwner(person1);

        Car car2 = new Car();
        car2.setModel("Audi");
        car2.setYear(2021);
        car2.setOwner(person1);

        carRepository.saveAll(Arrays.asList(car1, car2));
    }
}
