import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces1 {
    public static void main(String[] args) {
        // java.util.function package contains built-in FI
        // Predicate, Function, Supplier, Consumer

        // Predicate is a FI that takes a parameter of any type and returns boolean
        // Let's find out if a given number is odd or not
        int number = 10;
//        if(number % 2 == 1) {
//            System.out.println("Odd");
//        } else {
//            System.out.println("Even");
//        }
        Predicate<Integer> isOdd = num -> num % 2 == 1;
        System.out.println(isOdd.test(11));
        System.out.println(isOdd.test(12));

        String word = "hello world";
        Predicate<String> containsSpace = value -> value.contains(" ");
        System.out.println(containsSpace.test(word));
        System.out.println(containsSpace.test("HELLO"));

        // Let's check if a number is greater than 10 and divisible by 5 and also an even number
        // if(number > 10 && number % 5 == 0 && num % 2 == 0) {} in imperative style
        Predicate<Integer> gt10 = num -> num > 10;
        Predicate<Integer> divBy5 = num -> num % 5 == 0;
        Predicate<Integer> even = num -> num % 2 == 0;

        int input = 15;
        boolean result = gt10
                .and(divBy5)
                .and(even)
                .test(input);


        // Function is a FI that takes a parameter of ANY type and returns a value of ANY type
        // say you want to increment a number
        Function<Integer, Integer> increment = num -> num + 1;
        System.out.println(increment.apply(10));

        // convert a string to uppercase
        Function<String, String> caps = value -> value.toUpperCase();
        System.out.println(caps.apply("hello"));

        // get the length of an array
        Function<String[], Integer> len = arr -> arr.length;
        String[] words = {"sdf", "dsfdsf", "dsfdsf"};
        System.out.println(len.apply(words));

        // decrement a number by 1, square it, find the cube of it
        Function<Integer, Integer> decrement = num -> num - 1;
        Function<Integer, Integer> square = num -> num * num;
        Function<Integer, Integer> cube = num -> num * num * num;
        int inputNumber = 100;
        /*
        * fetch(...)
        * .then(...)
        * .then(...)
        *
        * axios(..)
        * .then(...)
        * .then(...)
        * */
        // Similar to Promises in JavaScript
        int resultValue = decrement
                .andThen(square)
                .andThen(cube)
                .apply(inputNumber);


    }
}

class OddPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 1;
    }
}

