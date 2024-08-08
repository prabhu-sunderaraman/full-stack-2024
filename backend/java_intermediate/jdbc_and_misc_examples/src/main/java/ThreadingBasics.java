public class ThreadingBasics {
    public static void main(String[] args) {
        System.out.println("Thread: " + Thread.currentThread().getName());
        // Creating a thread in Java creates an OS level thread
        // CPU takes care of scheduling the threads in the cores
        // How many threads should you create? -> Big question?
        Thread attentionThread = new Thread(() -> {
            while (true) {
                System.out.println("Paying attention on  " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        });
        attentionThread.start();

        Thread sleepingThread = new Thread(() -> {
            while (true) {
                System.out.println("Trying hard to pay attention " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        });
        sleepingThread.start();

    }
}
