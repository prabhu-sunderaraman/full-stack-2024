public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        //Figure figure = new Figure(); // cannot be instantiated
        Figure figure = new Circle();
        figure.draw();
        figure.paint();
        Figure.erase();
    }
}

interface Figure {
    long[] COORDINATES = new long[]{1L, 30L};

    default void draw() {
    }

    static void erase() {
    }

    abstract void paint();
}

interface Shape {
    default void calculateArea() {
    }

    static void plot() {
    }

    abstract void circumference();
}

class Circle implements Shape, Figure {
    public void paint() {
    }

    public void circumference() {
    }
}
