public class LimitationsOnInheritance {
    public static void main(String[] args) {
    }
}

// Polymorphism requires inheritance + overriding
// private methods cannot be overridden;
// static methods are not overridden
// you can disallow overriding by marking the method as final


class Base {
    public void doSomething() {}
    public final void doSomethingElse() {}
    private void silly() {}
    public static void aStaticMethod() {}
}

final class Derived extends Base {
    @Override
    public void doSomething() {}
//    @Override
//    public void doSomethingElse() {}

    // Not overridden
    public static void aStaticMethod() {}
//    @Override
//    public void silly() {}
}

// class Derived2 extends Derived {}

// Multiple inheritance is not allowed
//class MyClass extends Base, Derived {
//
//}