public class StringExample3 {
    public static void main(String[] args) {
        String name = "John Smith";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.split(" ")[0]);
        System.out.println(name.split(" ")[1]);
        System.out.println(name.substring(0, 3));
//        name.contains()
        String paragraph = """
                This is a 
                multi line 
                string
                """;
        System.out.println(paragraph);
        String json = """
                 {
                     "name": "Sam",
                     "age": 12
                 }
                """;
        System.out.println(json);
    }
}
