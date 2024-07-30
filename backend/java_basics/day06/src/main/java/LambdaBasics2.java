public class LambdaBasics2 {
    public static void main(String[] args) {

        // greetings1, greetings2, ourMath1, ourMath2 are variables with BLOCK of CODE as value

        Greetings greetings1 = name -> System.out.println("Hi " + name);
        Greetings greetings2 = (String name) -> System.out.println("Hello " + name);
        Greetings greetings3 = (String name) -> {
            System.out.println("Hey " + name);
            System.out.println("Hi " + name);
        };
        OurMath ourMath1 = (a, b) -> a + b;
        OurMath ourMath2 = (a, b) -> {
            return a - b;
        };
        OurMath ourMath3 = (int a, int b) -> a * b;
        int target = 77;
        GuessingGame game = guess -> {
            if (guess > target) {
                return "AIm lower";
            } else if (guess < target) {
                return "Aim higher";
            }
            return "You've got it";
        };

        GuessingGame lotteryGame = guess -> {
            int newTarget = (int) (Math.random() * 100);
            if (guess > newTarget) {
                return "AIm lower";
            } else if (guess < newTarget) {
                return "Aim higher";
            }
            return "You've got it";
        };
        System.out.println(lotteryGame.play(50));
        System.out.println(lotteryGame.play(60));

        killTime(game);
        killTime(lotteryGame);
        killTime(guess -> "Cool");
    }

    // Higher order functions in JS
    static void killTime(GuessingGame game) {
        game.play(100);
    }
}

@FunctionalInterface
interface GuessingGame {
    String play(int guess);
}

@FunctionalInterface
interface OurMath {
    int calculate(int a, int b);
}

@FunctionalInterface
interface Greetings {
    void greet(String name);
}
