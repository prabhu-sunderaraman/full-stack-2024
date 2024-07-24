public class StringExample2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);

        String str4 = new String("Hello");
        System.out.println(str1 == str4);

        // Stick to one way of creating strings in your application
        // Do not use == to compare the values in a string; Use .equals to compare the values
        System.out.println(str1.equals(str4));
    }
}
