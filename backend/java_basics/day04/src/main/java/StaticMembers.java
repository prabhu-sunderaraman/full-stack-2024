public class StaticMembers {
    public static void main(String[] args) {
        Counter.limit = 1;

        Counter c1 = new Counter();
        c1.increment();


        Counter c2 = new Counter();
        c2.limit = 2; // NOT RECOMMENDED

        Counter.print();
        c2.print(); // NOT RECOMMENDED
    }
}

class Counter {
    private int value;
    static int limit;

    static void print() {
        // System.out.println(value);
    }
    public void increment() {
        value++;
    }
}
