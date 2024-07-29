public class InnerClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        Outer.Inner inner = new Outer.Inner(); // ERROR
        //You can create an inner class object ONLY using outer class object
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.getClass().getName());
        inner.increment();

        TV sony = new TV();
        TV.Remote remote = sony.new Remote();
        System.out.println(remote.getClass().getName());
        remote.increaseVolume();
    }
}

class TV {
    private int volume;
    class Remote {
        public void increaseVolume() {
            volume++;
        }
        public void decreaseVolume() {
            volume--;
        }
    }
}

class Outer {
    private int num;
    class Inner {
        public void increment() {
            num++; // Inner classes can access Outer class private members
        }
    }
}