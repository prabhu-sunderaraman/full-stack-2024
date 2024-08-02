public class ExceptionHandling {
    public static void main(String[] args) {
        // Something wrong happens in your code while running
        // JVM collects the information about that error and creates an Object of type Exception
        // Gives that Exception object to your program
        // If you have written code to handle that Exception object, things are good
        // else JVM throws it onto your face

        int x = 10;
        int y = 0;
        try {
            System.out.println(x / y);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            System.out.println(x / y);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Opening a connection to DB");
            // open a connection to database
            // perform some DB operations
            System.out.println("Performing some DB operations");
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            // close connection to DB
            System.out.println("Closing the connection to DB");
        }


        System.out.println("End of main");
    }
}
