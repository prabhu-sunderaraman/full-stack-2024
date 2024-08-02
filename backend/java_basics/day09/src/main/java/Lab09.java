import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab09 {
    static List<String> errorLst = new ArrayList<>();

    public static void main(String[] args) {
        try {
            List<String> numbersInString = readNumbersFile();
            double average = numbersInString
                    .stream()
                    .filter(Lab09::isValidNumber)
                    .mapToInt(Integer::parseInt)
                    .average()
                    .getAsDouble();
            System.out.println("Average: " + average);
            System.out.println("** List of error values ***");
            errorLst.forEach(System.out::println);
        } catch (Lab09FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static boolean isValidNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            errorLst.add(value);
            return false;
        }
    }

    private static List<String> readNumbersFile() throws Lab09FileNotFoundException {
        String[] linesArr = null;
        try {
            InputStream is = Lab09.class.getResourceAsStream("/numbers.txt");
            String lines = new String(is.readAllBytes());
            linesArr = lines.split("\\n");
        } catch (Exception e) {
            throw new Lab09FileNotFoundException(e.getMessage());
        }
        List<String> linesLst = Arrays.stream(linesArr).toList();
        return linesLst;
    }
}

class Lab09FileNotFoundException extends Exception {
    public Lab09FileNotFoundException(String message) {
        super(message);
    }
}
