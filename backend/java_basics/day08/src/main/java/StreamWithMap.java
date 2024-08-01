import java.util.HashMap;
import java.util.Map;

public class StreamWithMap {
    public static void main(String[] args) {
        Map<String, String> countriesCapitalMap = new HashMap<>();
        countriesCapitalMap.put("India", "New Delhi");
        countriesCapitalMap.put("USA", "Washington DC");
        countriesCapitalMap.put("France", "Paris");
        countriesCapitalMap
                .forEach((key, value) -> System.out.println(key + ": " + value));

        countriesCapitalMap.values()
                .stream()
                .filter(it -> it.startsWith("N"))
                .forEach(System.out::println);

        countriesCapitalMap.keySet()
                .stream()
                .filter(it -> it.startsWith("I"))
                .forEach(System.out::println);

    }
}
