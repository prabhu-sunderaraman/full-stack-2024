import java.util.List;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            // Write code to email the error message to administrator
        }
        System.out.println("End of main");
    }

    static void doSomething() {
        try {
            doSomethingCrazy();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            // Write code to email the error message to administrator
        }
        System.out.println("End of doSomething");
    }

    static void doSomethingCrazy() {
        try {
            List<String> lst = null;
            System.out.println(lst.size());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            // Write code to email the error message to administrator
        }

        System.out.println("End of doSomethingCrazy");
    }
}
