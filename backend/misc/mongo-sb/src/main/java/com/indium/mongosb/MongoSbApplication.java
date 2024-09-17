package com.indium.mongosb;

import com.indium.mongosb.document.Person;
import com.indium.mongosb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoSbApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MongoSbApplication.class, args);
    }

    @Autowired
    private PersonService personService;

    @Override
    public void run(String... args) throws Exception {
//        Person person = new Person();
//        person.setFirstName("Mary");
//        person.setLastName("Ashley");
//        person.setAge(35);
//        personService.savePerson(person);
//        System.out.println("Person with id: " + person.getId() + " saved");
        personService.loadAllPersons().forEach(person -> {
            System.out.println(person);
        });
    }
}
