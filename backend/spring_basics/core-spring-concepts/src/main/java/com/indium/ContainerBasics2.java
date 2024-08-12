package com.indium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerBasics2 {
    public static void main(String[] args) {
        // Active container; It instantiates the classes(or beans) on startup
        // All the Component classes are in singleton scope by default
        ApplicationContext context = new AnnotationConfigApplicationContext("com.indium");
        Company company = context.getBean("company", Company.class);
        Truck truck1 = context.getBean("truck", Truck.class);
        System.out.println("Truck1: " + truck1);
        Truck truck2 = context.getBean("truck", Truck.class);
        System.out.println("Truck2: " + truck2);
        Truck truck3 = context.getBean("truck", Truck.class);
        System.out.println("Truck3: " + truck3);

        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager.getName());
    }
}
