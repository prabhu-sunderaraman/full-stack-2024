public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void swipeCard() {
        System.out.println("***Employee %s entering the office ".formatted(name));
    }

    public void work(int hours) {
        System.out.println("Employee %s works %s hours".formatted(name, hours));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
