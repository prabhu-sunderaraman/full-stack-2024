package com.indium;

public class SingletonPattern {
    public static void main(String[] args) {
        //Singleton Pattern - Creational Pattern
        //Ensures that a class has only one instance and provides a global point of access to it

//        VendingMachine princyVendingMachine = new VendingMachine();
//        VendingMachine lakshmiVendingMachine = new VendingMachine();
//        VendingMachine tarunVendingMachine = new VendingMachine();

        VendingMachine princyVendingMachine = VendingMachine.getVendingMachine();
        princyVendingMachine.drinkCoffee();
        VendingMachine lakshmiVendingMachine = VendingMachine.getVendingMachine();
        lakshmiVendingMachine.drinkCoffee();
        VendingMachine tarunVendingMachine = VendingMachine.getVendingMachine();
        tarunVendingMachine.drinkCoffee();

    }
}

//Singleton class
final class VendingMachine {
    private static VendingMachine vendingMachine = new VendingMachine();

    private VendingMachine() {
    }

    public static VendingMachine getVendingMachine() {
        return vendingMachine;
    }

    public void refill() {
        System.out.println("Vending machine is refilled");
    }

    public void drinkCoffee() {
        System.out.println("Coffee is served");
    }
}