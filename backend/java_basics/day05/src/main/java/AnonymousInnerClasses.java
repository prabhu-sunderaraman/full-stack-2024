import java.util.ArrayList;
import java.util.List;

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Greetings greetings = new GreetingsImpl();
        greetings.greet("Sam");

        // Anonymous inner class
        Greetings greetings2 = new Greetings() {
            public void greet(String name) {
                System.out.println("Hey " + name);
            }
        };
        System.out.println(greetings2.getClass().getName());
        greetings2.greet("Ram");

        // Anonymous inner class
        Greetings greetings3 = new Greetings() {
            public void greet(String name) {
                System.out.println("Wassup " + name);
            }
        };
        System.out.println(greetings3.getClass().getName());
        greetings3.greet("Joe");

        Greetings greetingsAnony = new Greetings() {
            public void greet(String name) {
            }
        };
        System.out.println(greetingsAnony.getClass().getName());
        Greetings greetingsAnony2 = new Greetings() {
            public void greet(String name) {
            }
        };
        System.out.println(greetingsAnony2.getClass().getName());

        Greetings greetingsAnony3 = new Greetings() {
            public void greet(String name) {
            }
        };
        System.out.println(greetingsAnony3.getClass().getName());

        Greetings greetingsAnony4 = new Greetings() {
            public void greet(String name) {
                Greetings greetingsAnony4 = new Greetings() {
                    public void greet(String name) {
                        Greetings greetingsAnony4 = new Greetings() {
                            public void greet(String name) {

                            }
                        };
                    }
                };
            }
        };
        System.out.println(greetingsAnony3.getClass().getName());

    }

}

interface Greetings {
    void greet(String name);

    default void doSomething() {
    }

    static void aStaticMethod() {
    }
}

class GreetingsImpl implements Greetings {
    public void greet(String name) {
        System.out.println("Hello " + name);
    }
}