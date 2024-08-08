import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ParallelStreams1 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            numbers.add(i);
        }

        // Parallel streams internally use ForkJoinPool
        // It creates n-1 worker threads (1 thread is main)
//        numbers
//                //.stream()
//                .parallelStream()
//                .filter(num -> {
//                    System.out.println("***Filtering " + num + " on " + Thread.currentThread().getName());
//                    MyThreadUtil.sleep(2);
//                    return num % 2 == 0;
//                }).forEach(num -> {
//                    System.out.println("***ForEach " + num + " on " + Thread.currentThread().getName());
//                    MyThreadUtil.sleep(2);
//                });

        ForkJoinPool forkJoinPool = new ForkJoinPool(100); // Why 100? and why not 1000? or 10000?
        forkJoinPool.submit(() -> {
            numbers
                    .parallelStream()
                    .filter(num -> {
                        System.out.println("***Filtering " + num + " on " + Thread.currentThread().getName());
                        MyThreadUtil.sleep(2);
                        return num % 2 == 0;
                    }).forEach(num -> {
                        System.out.println("***ForEach " + num + " on " + Thread.currentThread().getName());
                        MyThreadUtil.sleep(2);
                    });
        });
        forkJoinPool.awaitTermination(10, TimeUnit.MINUTES);


    }
}
