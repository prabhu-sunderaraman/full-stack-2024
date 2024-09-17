package com.indium;

//SOLID Principles

import java.util.ArrayList;
import java.util.List;

public class DesignPrinciples {
    public static void main(String[] args) {
//        lsp();
//        isp();
    }

    // Dependency Inversion Principle
    static void dip() {
        //DIP - Dependency Inversion Principle
        //High-level modules should not depend on low-level modules. Both should depend on abstractions.
        //Always ask a question on whether there are going to be multiple implementations of a class,
        // if yes DIP makes sense
        // or else it is an overkill
        // Example is Door (High-level module) and Alarm (Different types of alarms)
    }

    // Interface Segregation Principle
    static void isp() {
        //ISP - Interface Segregation Principle
        //A client should never be forced to implement an interface that it doesn't use.
        //Instead of having one big interface, break it down into smaller interfaces

        Circle circle = new Circle();
        circle.area(10.12, 34); //This is wrong; Does it make sense?

        Square square = new Square();
        square.area(10); //This is wrong; Does it make sense?
    }

    // Liskov Substitution Principle
    static void lsp() {
        //LSP - Liskov Substitution Principle
        //If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering any of the desirable properties of that program.
        Stack numbersStack = new Stack();
        numbersStack.push(11);
        numbersStack.push(12);
        removeNumber(numbersStack);
        removeNumber(numbersStack);

        EvenStack evenStack = new EvenStack();
        evenStack.push(11);
        evenStack.push(12);
        removeNumber(evenStack);
        removeNumber(evenStack);
    }

    // Quality of inheritance is bad
    static void removeNumber(Stack stack) {
        if (stack instanceof EvenStack) {
            System.out.println("Even stack");
            //additional behavior
        } else {
            System.out.println("Removed: " + stack.pop());
        }

    }

    //Open Closed Principle
    static void ocp() {
        //OCP - Open Closed Principle
        //A class should be open for extension, but closed for modification.
        Dog dog = new Dog();
        Cat cat = new Cat();
        train(dog);
        train(cat);
    }

    // Fails OCP
    // Not closed for modification; Every time you add a new Animal, this method needs to be modified
    //Identifying violation of OCP: If you have multiple if-else/switch-case statements
    //Use if-else conditions only IF YOU KNOW the requirements are not going to change
    //Whenever you write if-else conditions, think about the Open Closed Principle
    // and ASK your business analyst if the requirements are going to change in near future
    static void train(Animal animal) {
        animal.eat();
        animal.makeNoise();
//        if (animal instanceof Dog) {
//            Dog dog = (Dog) animal;
//            dog.bark();
//        } else if (animal instanceof Cat) {
//            Cat cat = (Cat) animal;
//            cat.meow();
//        } else if (animal instanceof Horse) {
//            Horse horse = (Horse) animal;
//            horse.neigh();
//        } else if (animal instanceof Monkey) {
//            Monkey monkey = (Monkey) animal;
//            monkey.shout();
//        }
    }

    static void srp() {
        //SRP - Single Responsibility Principle
        //A class should have one, and only one, reason to change.
        //This applies to a method or a package as well.

//        boolean valid = login();
//        if(!valid) {
//            sendEmail("");
//        }
    }

    // This method fails SRP
    // It is doing two things: logging in and sending an email
    // One of the consequences in a method that violates SRP, is it has longer methods
    // It is harder to read and understand and test
    // ANother indication that your code violates SRP is a lot of parameters
    private static void login() {
        String email = "john@yahoo.com";
        String password = "admin123";
        String encryptedPassword = encryptPassword(password);
        boolean valid = validateUser(email, encryptedPassword);
        //Not good to have this here
        if (!valid) {
            sendEmail(email, "Login failed");
        }
    }

    private static void sendEmail(String email, String loginFailed) {
    }

    private static boolean validateUser(String email, String encryptedPassword) {
        return false;
    }

    private static String encryptPassword(String password) {
        return password;
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Eating");
    }

    abstract void makeNoise();
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }

    @Override
    void makeNoise() {
        bark();
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }

    @Override
    void makeNoise() {
        meow();
    }
}

class Horse extends Animal {
    void neigh() {
        System.out.println("Neighing");
    }

    @Override
    void makeNoise() {
        neigh();
    }
}

class Monkey extends Animal {
    void shout() {
        System.out.println("Shouting");
    }

    @Override
    void makeNoise() {
        shout();
    }

}


class Stack {
    private List<Integer> numbers = new ArrayList<>();

    public void push(int number) {
        numbers.add(number);
    }

    public int pop() {
        return numbers.remove(numbers.size() - 1);
    }

    public int size() {
        return numbers.size();
    }
}

// This is not a correct inheritance, because push method limits the numbers that can be added
// and DOES not extend the behavior of the parent class
// This is a violation of Liskov Substitution Principle
class EvenStack extends Stack {
    @Override
    public void push(int number) {
        if (number % 2 == 0) {
            super.push(number);
        }
    }
}

interface Figure {
    double area(double radius);

    double area(double length, double breadth);

    double area(double side1, double side2, double side3);
}

interface CircleFigure {
    double area(double radius);
}

interface RectangleFigure {
    double area(double length, double breadth);
}

interface TriangleFigure {
    double area(double side1, double side2, double side3);
}

class Circle1 implements CircleFigure {
    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

class Triangle1 implements TriangleFigure {
    @Override
    public double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

class Triangle implements Figure {
    @Override
    public double area(double radius) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public double area(double length, double breadth) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

class Square implements Figure {
    @Override
    public double area(double radius) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public double area(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double area(double side1, double side2, double side3) {
        throw new RuntimeException("Invalid operation");
    }
}

class Circle implements Figure {
    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double area(double length, double breadth) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public double area(double side1, double side2, double side3) {
        throw new RuntimeException("Invalid operation");
    }
}