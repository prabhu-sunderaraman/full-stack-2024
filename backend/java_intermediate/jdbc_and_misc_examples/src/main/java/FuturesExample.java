import java.util.concurrent.*;

public class FuturesExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a thread that performs some computational work and returns a random number

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> randomNumberFuture = executorService.submit(() -> {
            int count = 0;
            while (count < 5) {
                System.out.println("****** Computing random number ... ");
                MyThreadUtil.sleep(1);
                count++;
            }
            int randomNumber = (int) (Math.random() * 100);
            return randomNumber;
        });
        System.out.println("Random number is " + randomNumberFuture.get()); // Blocks the current thread
        System.out.println("End of main");

        executorService.awaitTermination(1, TimeUnit.MINUTES);

    }
}
