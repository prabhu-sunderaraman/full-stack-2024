public class AbstractClasses {
    public static void main(String[] args) {
        Dog snoopy = new Dog();
        //Animal animal = new Animal(); // Abstract classes cannot be instantiated
        Animal rover = new Dog();
    }
}

abstract class Animal {
    private String name;
    public Animal() {}
    void walk() {}
    static void printInfo() {}

    abstract void makeNoise();
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("bow bow");
    }
}
