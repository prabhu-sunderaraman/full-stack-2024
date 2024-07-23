public class DataTypes {
    public static void main(String[] args) {
        // Primitive types are those that are stored on the stack
        byte b = 100;
        int i = 10;
        short s = 20;
        long l = 100L;
        boolean bool = false;
        char ch = 'A';
        double pi = 3.14;
        float num = 12.34f;

        // Reference types are those that are stored on the heap
        // All Objects are reference types (arrays, strings, collections)
        Byte byteObj = 100;
        Integer integerObj = 10;
        Short shortObj = 20;
        Long longObj = 100L;
        Boolean booleanObj = true;
        Character characterObj = 'A';
        Double doubleObj = 100.00;
        Float floatObj = 100.00f;

        var hello = 10; //Similar to JS in syntax, but totally different meaning
        // In Java var keyword is a gimmick. You cannot change the type of data
//        hello = "Sam";
//        hello = true;

        var name = "Sam";
        name = "Ram";
        name = "Joe";
//        name = 12;


    }
}
