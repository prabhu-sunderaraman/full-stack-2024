public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];  // Recommended; initialized to 0
        String words[] = new String[100]; // initialized to null
        boolean[] statuses = new boolean[100]; // are initialized to false

        // OLD STYLE
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            words[i] = "Hello";
        }

        // Read only; You cannot modify the value
        for (boolean status : statuses) {
            System.out.println(status);
        }

        String[] names = {"Sam", "Ram", "Mary", "Joe"};
        System.out.println(names.length);

        // 2d arrays; But not widely used; Use Maps instead
        int[][] matrix1 = new int[10][10];
        int[] matrix2[] = new int[4][4];
        int matrix3[][] = new int[12][22];
        int[][] matrix4 = new int[1][];


    }
}
