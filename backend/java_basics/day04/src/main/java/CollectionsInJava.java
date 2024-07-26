import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args) {
        // java.util contains all the collections
        // Dynamically growable collections
        // Collection is the root interface
        // List(ordered, allows duplication), Set(unordered, does not allow duplication)

        List<String> cities =  new Stack<>(); //new LinkedList<>(); //new ArrayList<>();
        cities.add("Chennai");
        cities.add("Pune");
        cities.add("Pondy");

        for (String city : cities) {
            System.out.println(city);
        }

        Set<Integer> numbers = new TreeSet<>(); //new LinkedHashSet<>(); //new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        for (int num : numbers) {
            System.out.println(num);
        }

        Map<Integer, String> romanNumbers =    new TreeMap<>(); // new LinkedHashMap<>(); // new Hashtable<>(); // new HashMap<>();
        romanNumbers.put(1, "I");
        romanNumbers.put(2, "II");
        romanNumbers.put(3, "III");

        Set<Integer> keys = romanNumbers.keySet();
        for (int key : keys) {
            System.out.println(key + ", " + romanNumbers.get(key));
        }


    }
}
