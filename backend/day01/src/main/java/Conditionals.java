public class Conditionals {
    public static void main(String[] args) {
        // if-else, switch-case
        int i = 10;
        if (i > 10) {
            System.out.println("i is gt 10");
        } else if (i < 10) {
            System.out.println("i is less than 10");
        } else {
            System.out.println("i is equal to 10");
        }

        // OLD STYLE
        switch (i % 2) {
            case 0:
                System.out.println("i is even");
                break;
            case 1:
                System.out.println("i is odd");
                break;
            default:
                System.out.println("Not sure what kind of number this is");
        }
    }
}
