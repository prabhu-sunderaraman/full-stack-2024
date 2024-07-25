public class OOConcepts {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        car.drive(200);
        car.drive(200, "NH 90");
        car.driveThrough(200, "Chennai", "Vellore", "Hosur", "Bangalore");
        car.driveThrough(20, "Guindy", "Askhok nagar");
    }
}
