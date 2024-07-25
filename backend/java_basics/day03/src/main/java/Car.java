import java.util.Arrays;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void driveThrough(int speed, String ... cities) {
        System.out.println("Driving %s through %s at a speed of %s kmph".formatted(model, Arrays.toString(cities), speed));
    }

    // Method overloading
    public void drive(int speed) {
        System.out.println("Driving %s at a speed of %s kmph".formatted(model, speed));
    }

    public void drive(int speed, String roadName) {
        System.out.println("Driving %s on %s at a speed of %s kmph".formatted(model, roadName, speed));
    }
}
