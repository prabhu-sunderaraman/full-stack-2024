public class LambdaBasics {
    public static void main(String[] args) {
        Addition additionImpl =  (a, b) -> a + b;
        System.out.println(additionImpl.getClass().getName());
        System.out.println(additionImpl.add(10, 20));

        // MyMath myMath = (a, b) -> a - b;
        // Lambda expressions can be used only on interfaces that have ONLY ONE abstract method
        // Interfaces with JUST ONE abstract method are known as Functional interfaces

        Subtraction sub = (a, b) -> a - b;
    }
}

@FunctionalInterface
interface Subtraction {
    int subtract(int a, int b);
    //int subtract2(int a, int b);
}

class MyMathImpl implements  MyMath {
    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int difference(int a, int b) {
        return 0;
    }
}
// You cannot use lambda expression
interface MyMath {
    int sum(int a, int b);
    int difference(int a, int b);
}

interface Addition {
    int add(int a, int b);
    default void doSomething() {

    }
    static void doSomethingElse() {

    }
    int num = 10;

}