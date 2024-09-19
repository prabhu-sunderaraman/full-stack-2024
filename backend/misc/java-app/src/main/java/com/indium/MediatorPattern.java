package com.indium;

public class MediatorPattern {
    public static void main(String[] args) {
        // Mediator Pattern - Behavioral Pattern
        // Defines an object that encapsulates how a set of objects interact
        // Promotes loose coupling by keeping objects from referring to each other explicitly

        HouseOwner houseOwner = new HouseOwner();
        ProbableHouseTenant probableHouseTenant = new ProbableHouseTenant();

        HouseBroker houseBroker = new HouseBroker();
        houseBroker.getHouseDetails(houseOwner);
        houseBroker.showHouse(probableHouseTenant);
        houseBroker.communicate(houseOwner, probableHouseTenant);

    }
}

// Mediator class
class HouseBroker {
    public void communicate(HouseOwner houseOwner, ProbableHouseTenant probableHouseTenant) {
        System.out.println("Communication is done");
    }

    public void showHouse(ProbableHouseTenant probableHouseTenant) {
        System.out.println("House is shown");
    }

    public void getHouseDetails(HouseOwner houseOwner) {
        System.out.println("House details are shared");
    }
}

class ProbableHouseTenant {

}

class HouseOwner {

}