public class StringExample1 {
    public static void main(String[] args) {
        String str = "Hello";
        str = "Hi";
        str = "Bye";
        str += " bye";

        String numbers = "";
        for (int i = 0; i < 100; i++) {
            numbers += i; // BAD CODING
        }
        System.out.println(numbers);
        // String manipulation operations lead to increase in memory and has an impact on performance
        // Use Strings as constants; Do not keep changing the values

        // Use StringBuilder if you want to perform string operations
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());
    }
}
