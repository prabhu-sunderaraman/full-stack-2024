import java.util.Arrays;
import java.util.List;

public class InternalsOfStreams {
    public static void main(String[] args) {
        // Streams do not process the entire collection as a whole
        // It takes one item at a time, passes it through all the blocks till the terminal operation
        // It's the opposite in JS. Every block processes the entire collection

        List<Integer> numbers = Arrays.asList(121, 34543, 64571, 873, 89, 231, 892, 456, 12, 45, 8, 903);
        // find the even numbers; increment by 1; print the first result only
        numbers
                .stream()
                .filter(num -> {
                    System.out.println("===== filtering " + num);
                    return num % 2 == 0;
                })
                .map(num -> {
                    System.out.println("***** map " + num);
                    return num + 1;
                })
                .findFirst()
                .ifPresent(System.out::println);


//                .forEach(num -> {
//                    System.out.println("~~~~~ printing " + num);
//                    System.out.println(num);
//                });
    }
}
