
import java.util.Scanner;

/*
 * All class names begin with UpperCase
 * All method names, variable names begin with lowerCase
 * Follow a camelCase convention. ie., the start of a new word is Capitalized
 * The name of the public class and the name of the file is(has to be) same
 * Package names are in lowercase. they don't even follow camelCase notation
 * */

public class GuessingGameLab01 {
    public static void main(String[] args) {
        final String AIM_HIGHER = "Aim higher";
        final String AIM_LOWER = "Aim lower";
        System.out.println("Welcome to the guessing game. Enter a number between 1 and 100");
        final int target = (int) (Math.random() * 100);
        int numberOfAttempts = 0;
        int guess = -1;
        boolean gameOver = false;
        String message = "";
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            ++numberOfAttempts;
            guess = scanner.nextInt();
            if (guess > target) {
                message = AIM_LOWER;
            } else if (guess < target) {
                message = AIM_HIGHER;
            } else if (guess == target) {
                message = "You've got it in %s attempts".formatted(numberOfAttempts);
                gameOver = true;
            }
            System.out.println(message);
        }
    }
}