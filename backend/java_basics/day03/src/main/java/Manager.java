public class Manager extends Employee {
    private int level;

    public Manager(String name, double salary, int level) {
        super(name, salary);
        this.level = level;
    }

    // @Override is an annotation; NOT mandatory
    @Override
    public void work(int hours) {
        //super.work(hours);
        System.out.println("Manager %s works %s hours".formatted(getName(), hours));
    }

    public void swipeCard() {
        System.out.println("***Manager %s entering the office ".formatted(getName()));
    }
}
