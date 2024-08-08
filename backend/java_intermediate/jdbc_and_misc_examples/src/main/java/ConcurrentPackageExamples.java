import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentPackageExamples {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            int count = 0;
            while (count < 10) {
                System.out.println("=== Checking messages on WA :" + Thread.currentThread().getName());
                MyThreadUtil.sleep(1);
                count++;
            }
            System.out.println("=== I am done checking messages. Let me get back to work");
        });

        executorService.submit(() -> {
            while (true) {
                System.out.println("*** Munching chips  :" + Thread.currentThread().getName());
                MyThreadUtil.sleep(5);
            }
        });

        executorService.submit(() -> {
            while (true) {
                System.out.println("*** Start coding  :" + Thread.currentThread().getName());
                MyThreadUtil.sleep(1);
            }
        });


        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
