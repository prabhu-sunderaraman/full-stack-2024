package com.indium.spring_boot_basics;

import com.indium.spring_boot_basics.labs.lab01.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        // This is same as creating ApplicationContext
        // Scanning all the classes in the packages specified
        // Instantiating all the beans
        SpringApplication.run(SpringBootBasicsApplication.class, args); // since this is asynchronous
    }

    @Autowired
    Door door;

    @Autowired
    Person person;

    @Autowired
    Car car;

    @Autowired
    MyDatabaseCredentials myDatabaseCredentials;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myDatabaseCredentials.getUsername());
        System.out.println(myDatabaseCredentials.getPassword());
        System.out.println(myDatabaseCredentials.getConnectionString());
//        door.open();
//        door.close();
//        System.out.println(person.getName());
//        System.out.println(car.getModel());

//        person.getHobbies().forEach(System.out::println);
//        person.getCitiesVisited().forEach(System.out::println);

        myDatabaseCredentials.getSchemas().forEach(System.out::println);
        myDatabaseCredentials.getUsers().forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
