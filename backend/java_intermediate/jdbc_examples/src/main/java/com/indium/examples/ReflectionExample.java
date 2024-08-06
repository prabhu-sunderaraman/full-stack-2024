package com.indium.examples;

import jdk.jfr.Label;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        // com.indium.examples.Car.class contains bytecodes + metadata
        // metadata has information about that class (name, members, superclass, interfaces, constructors)
        // metadata is a reflection of the class that you have written
        // Loading this metadata during runtime is a HUGE HUGE functionality;

        //Class carCls = Car.class;
        Class carCls = Class.forName("com.indium.examples.Car");
        System.out.println("== Package name: " + carCls.getPackageName());
        System.out.println("=== Super class: " + carCls.getSuperclass().getName());
        Field[] fields = carCls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("=== Field: " + field.getName() + ", " + field.getType());
        }
        Method[] methods = carCls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("=== Method: " + method.getName() + ", " + method.getReturnType() + ", Parameters: " + method.getParameterCount());
        }
        Constructor[] constructors = carCls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("=== Constructor === ");
            Class[] constructorParameterTypes = constructor.getParameterTypes();
            for (Class constructorParameterType : constructorParameterTypes) {
                System.out.println(constructorParameterType.getName());
            }
        }
        for (Class interfaceCls : carCls.getInterfaces()) {
            System.out.println("==== Interface: " + interfaceCls.getName());
        }

        System.out.println("------- Let's create a Car object dynamically using Reflection -------");

//        Car bmw = new Car("BMW", 2020);
        Constructor carConstructor = carCls.getConstructor(String.class, int.class);
        Object carObject = carConstructor.newInstance("BMW", 2020);
        // Let's invoke drive method
        Method driveMethod = carCls.getMethod("drive", int.class);
        driveMethod.invoke(carObject, 100);

        Method getYearMethod = carCls.getMethod("getYear");
        Object year = getYearMethod.invoke(carObject);
        System.out.println("Year: " + year);

        Field yearField = carCls.getDeclaredField("year");
        yearField.setAccessible(true);
        yearField.setInt(carObject, 2025);
        System.out.println("===== After changing the year");
        year = getYearMethod.invoke(carObject);
        System.out.println("Year: " + year);

        for(Annotation annotation : carCls.getDeclaredAnnotations()) {
            System.out.println("==== Annotation: " + annotation.annotationType().getName());
        }

        Car ferrari = new Car("Ferrari", 2017);
        Class ferrariCls = ferrari.getClass();

        Field yearFieldOfFerrari = ferrariCls.getDeclaredField("year");
        yearFieldOfFerrari.setAccessible(true);
        yearFieldOfFerrari.set(ferrari, 2024);
        // IntelliSense
    }
}

interface Vehicle {
}

@Label("Cool car")
class Car implements Vehicle {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void drive(int speed) {
        System.out.println("Driving " + this.model + " at a speed of " + speed + "kmph");
    }
}