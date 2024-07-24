public class Book {
    // has-a relationship
    // Members
    // Instance variables
    String title;
    double price;
    String author;
    Publisher publisher;

    void read() {
        System.out.println("Reading " + title);
    }
    void buy(String store) {
        System.out.println("Buying " + this.title + " from " + store);
    }
}
