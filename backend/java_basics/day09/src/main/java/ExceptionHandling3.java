import java.util.List;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            doSomethingCrazy();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            // Write code to email the error message to administrator
        }
        System.out.println("End of main");
    }

    static void doSomethingCrazy() {
        try {
            List<String> lst = null;
            System.out.println(lst.size());
        } catch (Exception ex) {
            throw ex; // throw keyword is used to propagate the exceptions to the caller
        }

        System.out.println("End of doSomethingCrazy");
    }
}
