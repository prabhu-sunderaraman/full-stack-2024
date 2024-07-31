import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Sam", 12),
                new Person("Ram", 32),
                new Person("Mary", 56),
                new Person("Joe", 78)
        );
        persons
                .stream()
                .map(item -> item.getName())
                .forEach(item -> System.out.println(item));

        
    }
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
