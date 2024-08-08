import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ConcurrentPackageExamples2 {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        ExecutorService executorService = Executors.newCachedThreadPool();
        // ThreadFactory to specify priorities

        // THIS IS WHAT IS USED IN PARALLEL STREAMS
        ForkJoinPool forkJoinPool = new ForkJoinPool(3);

        forkJoinPool.execute(() -> {
            int count = 0;
            while (count < 10) {
                System.out.println("=== Checking messages on WA :" + Thread.currentThread().getName());
                MyThreadUtil.sleep(1);
                count++;
            }
            System.out.println("=== I am done checking messages. Let me get back to work");
        });

        forkJoinPool.execute(() -> {
            while (true) {
                System.out.println("*** Munching chips  :" + Thread.currentThread().getName());
                MyThreadUtil.sleep(5);
            }
        });

        forkJoinPool.execute(() -> {
            while (true) {
                System.out.println("*** Start coding  :" + Thread.currentThread().getName());
                MyThreadUtil.sleep(1);
            }
        });


        forkJoinPool.awaitTermination(1, TimeUnit.MINUTES);
    }
}
