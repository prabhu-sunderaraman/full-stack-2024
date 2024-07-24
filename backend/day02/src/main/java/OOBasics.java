public class OOBasics {
    public static void main(String[] args) {
        // book1 is an instance of Book class
        // book1 is a reference to Book class object
        // Book is instantiated to create book1
        Book book1 = new Book();
        book1.title = "ABC";
        book1.price = 12.34;
        book1.author = "James";
        book1.publisher = new Publisher();
        book1.publisher.name = "Penguin";
        book1.publisher.id = "p101";

        book1.read();
        book1.buy("Amazon");

        Book book2 = new Book();
        book2.title = "DABC";
        book2.price = 112.34;
        book2.author = "Siri";

        System.out.println(book1 == book2);

        book2 = null;
    }
}
