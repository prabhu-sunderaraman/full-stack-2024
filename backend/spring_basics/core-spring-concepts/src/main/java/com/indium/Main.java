package com.indium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

// Spring framework is called a lightweight container
// container manages the lifecycle of all the objects
public class Main {
    public static void main(String[] args) {

//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("classpath:beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("com.indium");

        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName() + ", " + person.getAge());

        Country country = context.getBean("country", Country.class);
        System.out.println(country.getName() + ", " + country.getPopulation());

        Book book1 = context.getBean("book", Book.class);
        System.out.println(book1.getTitle() + ", " + book1.getPrice());

//        Car car = new Car();
//        Engine engine = new Engine();
//        car.setEngine(engine);

        Car car1 = context.getBean("car", Car.class);
        System.out.println(car1.model + ", " + car1.year + ", " + car1.engine.power);

//        Person person = new Person();
//        person.setName("Sam");
//        person.setAge(22);
//        System.out.println(person.getName() + ", " + person.getAge());
//
//        Country country = new Country();
//        country.setName("India");
//        country.setPopulation(987897);
//        System.out.println(country.getName() + ", " + country.getPopulation());
    }
}
