import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamBasics2 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "JavaScript", "Python", "TypeScript");

        // Streams were introduced in 1.8
        // They are used for read-only purposes; you cannot modify the underlying collection
        // Streams cannot be reused
        Stream<String> languagesStream = languages.stream(); // a snapshot of the collection is created
        languagesStream
                .filter(item -> item.startsWith("J")) //returns a collection of filtered items
                .forEach(item -> System.out.println(item));

        // ERROR: because stream has already been operated upon
//        languagesStream
//                .filter(item -> item.startsWith("P")) //returns a collection of filtered items
//                .forEach(item -> System.out.println(item));

        Set<Integer> numbers = new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        Stream<Integer> numbersStream = numbers.stream();
        numbersStream
                .map(item -> item * item) //returns the same sized collection after transformation
                .forEach(item -> System.out.println(item));

        numbers
                .stream()
                .forEach(item -> System.out.println(item));

        // Streams are lazily evaluated
        numbers
                .stream()
                .map(num -> {
                    System.out.println("****Calculating cube of num: " + num);
                    return num * num * num;
                });
        numbers
                .stream()
                .map(num -> {
                    System.out.println("****Calculating square of num: " + num);
                    // numbers.add(10000); CANNOT modify the underlying collection when you are using stream
                    return num * num;
                })
                .forEach(num -> System.out.println(num));

        System.out.println("End of Main");

    }
}
