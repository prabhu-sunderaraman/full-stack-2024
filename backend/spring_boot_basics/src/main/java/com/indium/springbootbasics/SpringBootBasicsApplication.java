package com.indium.springbootbasics;

import com.indium.springbootbasics.labs.lab01.Door;
import com.labs.lab02.Conference;
import com.labs.lab02.SessionPlanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
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

    @Autowired
    Conference conference;

    @Autowired
    SessionPlanner sessionPlanner;

    @Override
    public void run(String... args) throws Exception {

        sessionPlanner.getTopics().forEach(System.out::println);

//        conference.getTopics().get(45).forEach(System.out::println);
//        conference.getTopics().get(60).forEach(System.out::println);
//        conference.getTopics().get(90).forEach(System.out::println);


//        System.out.println(myDatabaseCredentials.getUsername());
//        System.out.println(myDatabaseCredentials.getPassword());
//        System.out.println(myDatabaseCredentials.getConnectionString());
//        door.open();
//        door.close();
//        System.out.println(person.getName());
//        System.out.println(car.getModel());

//        person.getHobbies().forEach(System.out::println);
//        person.getCitiesVisited().forEach(System.out::println);

//        myDatabaseCredentials.getSchemas().forEach(System.out::println);
//        myDatabaseCredentials.getUsers().forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
