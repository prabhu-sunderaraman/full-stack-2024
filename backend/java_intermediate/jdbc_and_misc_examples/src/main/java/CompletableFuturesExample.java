import java.util.concurrent.*;

public class CompletableFuturesExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a thread that performs some computational work and returns a random number
        // CompletableFuture is similar to promises in JS

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CompletableFuture
                .supplyAsync(() -> {
                    int count = 0;
                    while (count < 5) {
                        System.out.println("****** Computing random number ... ");
                        MyThreadUtil.sleep(1);
                        count++;
                    }
                    int randomNumber = (int) (Math.random() * 100);
                    return randomNumber;
                }, executorService)
                .thenAccept(result -> System.out.println("Random number is " + result));

        System.out.println("End of main");

        executorService.awaitTermination(1, TimeUnit.MINUTES);

    }
}
