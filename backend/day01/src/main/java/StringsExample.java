public class StringsExample {
    public static void main(String[] args) {
        // Strings are reference types;
        // You can create with a new keyword or without a new keyword!!! (Be Cautious!!!)
        // Immutable by design

        String firstName = "Jane";
        String lastName = new String("Doe");

        String comments = "Cool climate!"; // Similar to creating a constant variable
        System.out.println(comments);

        // Internally the old value is not changed; Instead a new value gets created
        comments += " But it's getting hotter by the day";
        System.out.println(comments);

        comments = "Winter time!";
    }
}
