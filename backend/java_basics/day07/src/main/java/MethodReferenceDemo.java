import com.indium.labs.Item;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Sam", 12),
                new Person("Ram", 32),
                new Person("Mary", 56),
                new Person("Joe", 78)
        );
        persons
                .stream()
                //.map(item -> item.getName())
                .map(Person::getName)
                //.forEach(item -> System.out.println(item));
                .forEach(System.out::println);

        MyMath myMath1 = num -> num * num;
        myMath1.compute(12);

        MyMath myMath2 = MethodReferenceDemo::findSquare;
        myMath2.compute(100);

        // MyMath myMath3 = num -> num * num * num;
        MyMath myMath3 = MethodReferenceDemo::cube;
        myMath3.compute(12);

        // Readability takes a beating

//        MyMath myMath4 = num -> {
//            // write code to find square root
//            // write some more code
//            int result = -1;
//            return result;
//        };

        MyMath myMath4 = MethodReferenceDemo::findSquareRoot;


    }

    static int findSquareRoot(int num) {
        // write code to find square root
        // write some more code
        int result = -1;
        return result;
    }

    static int cube(int num) {
        return num * num * num;
    }

    static int findSquare(int num) {
        return num * num;
    }
}

interface MyMath {
    int compute(int num);
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
