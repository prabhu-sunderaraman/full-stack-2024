import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces2 {
    public static void main(String[] args) {
        // java.util.function package contains built-in FI
        // Predicate, Function, Supplier, Consumer

        // Supplier does not take in ANY parameter but returns value of ANY type
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
        System.out.println(randomSupplier.get());

        Supplier<LocalDateTime> now = () -> LocalDateTime.now();
        System.out.println(now.get());

        // Consumer takes data of ANY type but does not return anything

        Consumer<String> printer = data -> System.out.println(data);
        printer.accept("some data");

        Consumer<List<Integer>> loopAndPrint = lst -> {
            for (int num : lst) {
                System.out.println(num);
            }
        };
        loopAndPrint.accept(Arrays.asList(10, 20, 30, 40));


    }
}


