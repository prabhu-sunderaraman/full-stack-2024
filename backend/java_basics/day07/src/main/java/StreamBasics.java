import java.util.Arrays;
import java.util.List;

public class StreamBasics {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "JavaScript", "Python", "TypeScript");

        // find the languages that begin with J and print them in Uppercase
        // Imperative style;
        // You have to write code what to do and also how to do
        // Say the size of the list is 10 lakhs; How do you process them parallely instead of sequential
        // You need to split your list into smaller chunks and run them concurrently and gather the results
        for (int i = 0; i < languages.size(); i++) {
            String lang = languages.get(i);
            if(lang.startsWith("J")) {
                System.out.println(lang.toUpperCase());
            }
        }

        // Declarative or Functional style
        // You only write code and say what to do
        // You can easily switch between sequential and parallel processing without needing to redesign/rewrite
        languages
                .stream()
                .filter(item -> item.startsWith("J"))
                .map(item -> item.toUpperCase())
                .forEach(item -> System.out.println(item));
        /*
        * languages
        *     .filter(item => item.startsWith("J")
        *     .map(item => item.toUpperCase())
        *     .forEach(item => console.log(item));
        * */
    }
}
