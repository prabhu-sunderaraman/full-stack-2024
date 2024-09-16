package com.indium;

//SOLID Principles

public class dp {
    public static void main(String[] args) {

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
