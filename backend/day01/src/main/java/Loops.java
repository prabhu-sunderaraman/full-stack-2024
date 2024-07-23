public class Loops {
    public static void main(String[] args) {
        // for, for...in, while, do...while

        // OLD STYLE
        // MODERN STYLE INVOLVES lambda expressions (Similar to arrow functions in JS)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int[] numbers = {10, 20, 30};
        for (int number : numbers) {
            System.out.println(number);
        }

        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println("Do you want to continue?");
            count++;
        } while (count < 10);
    }
}
