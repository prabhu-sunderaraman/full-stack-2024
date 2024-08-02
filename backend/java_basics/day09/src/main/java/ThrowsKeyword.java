import java.util.List;

public class ThrowsKeyword {
    public static void main(String[] args) throws Exception {
//        try {
//            doSomethingCrazy();
//        }
//        catch(Exception ex) {
//            // DO whatever you want
//        }

        doSomethingCrazy();
        System.out.println("End of main");
    }

    static void doSomethingCrazy() throws Exception {
        try {
            List<String> lst = null;
            System.out.println(lst.size());
        } catch (NullPointerException ex) {
            // I want to create a new Exception with the message and throw it back
            throw new Exception(ex.getMessage());
        }

        System.out.println("End of doSomethingCrazy");
    }
}
