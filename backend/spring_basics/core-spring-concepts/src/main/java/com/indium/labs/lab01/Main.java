package com.indium.labs.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.indium.labs.lab01");
        Door door = context.getBean("door", Door.class);
        door.open();
        door.close();
    }
}
