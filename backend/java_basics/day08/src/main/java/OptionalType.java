import java.util.*;

public class OptionalType {
    static Map<Integer, String> romanNumbers = new HashMap<>();

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(121, 34543, 64571, 873, 89, 231, 892);

        int evenNumber = numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .findAny()
                .orElseGet(() -> -1);
        System.out.println(evenNumber);

        Optional<Integer> optionalInteger = numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .findAny();
        if (optionalInteger.isPresent()) {
            System.out.println("Even: " + optionalInteger.get());
        }


        romanNumbers.put(1, "I");
        romanNumbers.put(2, "II");
        romanNumbers.put(3, "III");

        String result = getRomanNumberOf(4);
        if (result != null) {
            System.out.println(result + ", length: " + result.length());
        } else {
            System.out.println("result is null");
        }

        Optional<String> resultBox = getRomanNumber(5);
        if (resultBox.isPresent()) {
            System.out.println(resultBox.get());
        } else {
            System.out.println("result is empty");
        }
    }

    static Optional<String> getRomanNumber(int number) {
        Optional<String> result = Optional.empty(); // creating a box; it is empty initially
        if (romanNumbers.containsKey(number)) {
            result = Optional.of(romanNumbers.get(number)); // fill the box with the value
        }
        return result; // returning the box
    }

    // Not a good programming practice
    static String getRomanNumberOf(int number) {
        if (romanNumbers.containsKey(number)) {
            return romanNumbers.get(number);
        }
        return null;
    }
}
