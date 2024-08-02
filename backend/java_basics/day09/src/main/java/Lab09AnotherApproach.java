import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Java has two kinds of Exceptions: Checked exception and Unchecked exception
 * Checked exceptions: IOException, SqlException ...
 * Checked exceptions are classes that "extend" Exception
 * Checked exceptions MUST be handled in the code either using try/catch or atleast a warning using throws
 * Unchecked exceptions: ArithmeticException, NumberFormatException, NullPointerException ...
 * Unchecked exceptions are classes that "extend" RuntimeException
 * Unchecked exceptions NEED NOT be handled in the code during development
 * */

public class Lab09AnotherApproach {
    static List<String> errorLst = new ArrayList<>();

    public static void main(String[] args) {
        List<String> numbersInString = readNumbersFile();
        double average = numbersInString
                .stream()
                .filter(Lab09AnotherApproach::isValidNumber)
                .mapToInt(Integer::parseInt)
                .average()
                .getAsDouble();
        System.out.println("Average: " + average);
        System.out.println("** List of error values ***");
        errorLst.forEach(System.out::println);
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

    private static List<String> readNumbersFile() {
        String[] linesArr = null;
        try {
            InputStream is = Lab09.class.getResourceAsStream("/numbers.txt");
            String lines = new String(is.readAllBytes());
            linesArr = lines.split("\\n");
        } catch (Exception e) {
            throw new Lab09AnotherApproachFileNotFoundException(e.getMessage());
        }
        List<String> linesLst = Arrays.stream(linesArr).toList();
        return linesLst;
    }
}

class Lab09AnotherApproachFileNotFoundException extends RuntimeException {
    public Lab09AnotherApproachFileNotFoundException(String message) {
        super(message);
    }
}
