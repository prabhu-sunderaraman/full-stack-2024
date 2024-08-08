public class ConcurrencyBasics {
    public static void main(String[] args) {
        // Golang, Erlang, Scala
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of processors: " + numberOfProcessors);

        // Concurrency vs. Parallelism

        // Concurrency (multi-tasking)
        // You want to be able to do multiple tasks; cook, cut veggies, heat something in microwave
        // In a single core processor;

        // Parallelism
        // Ability to perform simultaneous tasks or actions
        // Two cooks in a kitchen; both simultaneously performing the chores
        // 2 core processor
        // 4 core processor -> 4 actions can happen simultaneously
        // 8 core processor -> 8 actions can execute parallely

        // You have a Java application that has to do the following simultaneously
        // 1. wait for user input
        // 2. constantly connect to a DB and check for new records
        // 3. periodically run a stopwatch timer
        // 4. connect to google weather news and check for updates on rain or snow


        // I have a 4 core processor; that means I can execute 4 activities parallely in my application
        // How do you build your application to run 4 activities simultaneously
        // Thread?
        // Each activity should run independently of the other; meaning->it should have its own space and boundary
        // Convert every activity to a separate Entity called "Thread"
        // Thread is a separate line of execution

        Thread walkingThread = new Thread(() -> {
            while (true) {
                System.out.println("...Dog 1 Walking...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        walkingThread.start();

        Thread waggingThread = new Thread(() -> {
            while (true) {
                System.out.println("***Dog 1 wagging tail***");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });
        waggingThread.start();

        Thread sniffingThread = new Thread(() -> {
            while (true) {
                System.out.println("***Dog 1  sniff sniff sniff");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        });
        sniffingThread.start();

        Thread barkingThread = new Thread(() -> {
            while (true) {
                System.out.println("Dog 1 bow bow bow bow");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                }
            }
        });
        barkingThread.start();

        Thread walkingThread2 = new Thread(() -> {
            while (true) {
                System.out.println("...Dog 2 Walking...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        walkingThread2.start();

        Thread waggingThread2 = new Thread(() -> {
            while (true) {
                System.out.println("***Dog 2 wagging tail***");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });
        waggingThread2.start();

        Thread sniffingThread2 = new Thread(() -> {
            while (true) {
                System.out.println("***Dog 2 sniff sniff sniff");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        });
        sniffingThread2.start();

        Thread barkingThread2 = new Thread(() -> {
            while (true) {
                System.out.println("Dog 2 bow bow bow bow");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                }
            }
        });
        barkingThread2.start();

        Thread walkingThread3 = new Thread(() -> {
            while (true) {
                System.out.println("...Dog 3 Walking...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        walkingThread3.start();

        Thread waggingThread3 = new Thread(() -> {
            while (true) {
                System.out.println("***Dog 3 wagging tail***");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });
        waggingThread3.start();

        Thread sniffingThread3 = new Thread(() -> {
            while (true) {
                System.out.println("***Dog 3  sniff sniff sniff");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        });
        sniffingThread3.start();

        Thread barkingThread3 = new Thread(() -> {
            while (true) {
                System.out.println("Dog 3 bow bow bow bow");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                }
            }
        });
        barkingThread3.start();
    }
}
