import java.util.*;

public class DiscussionsOnCollections {
    public static void main(String[] args) {
        // compareSetvsList();
    }

    static void linkedListVsArrayList() {

        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Adding to the front and back
        ((LinkedList<Integer>) linkedList).addFirst(5);
        ((LinkedList<Integer>) linkedList).addLast(35);

        // Accessing elements
        System.out.println("First element: " + linkedList.get(0));  // Slower access

        // Removing elements
        linkedList.remove(Integer.valueOf(20));  // Faster when removing first or last
        ((LinkedList<Integer>) linkedList).removeFirst();
        ((LinkedList<Integer>) linkedList).removeLast();

        // Iterating over elements
        for (int num : linkedList) {
            System.out.println(num);
        }
    }

    public static void compareSetvsList() {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        System.out.println("Setting values in list and set .... ");
        int counter = 100000;

        for (int i = 0; i < counter; i++) {
            list.add(i);
            set.add(i);
        }

        System.out.println("Checking time .... ");
        long l1 = System.currentTimeMillis();
        //list.stream().forEach(System.out::println);


//        for (int i = 0; i < counter; i++) {
//            list.contains(i);
//
//        }

        long l2 = System.currentTimeMillis();
        //  System.out.println("Time taken for list: " + (l2 - l1) + " ms");

        set.stream().forEach(System.out::println);
//        for (int i = 0; i < counter; i++) {
//            set.contains(i);
//
//        }

        long l3 = System.currentTimeMillis();
        System.out.println("Time taken for set: " + (l3 - l2) + " ms");
    }
}
