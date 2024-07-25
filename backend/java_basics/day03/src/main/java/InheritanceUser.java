public class InheritanceUser {
    public static void main(String[] args) {
//        Employee emp = new Employee("Sam", 10000);
//        Manager mgr = new Manager("Ram", 20000, 3);
//        System.out.println(mgr.getName() + ", " + mgr.getSalary());
//        mgr.work(10);

//        Manager ram = new Manager("Ram", 20000, 3);
//        SecurityPersonnel joe = new SecurityPersonnel("Joe", 10000, "8AM-4PM");
//        SecurityPersonnel john = new SecurityPersonnel("John", 10000,"4PM-12AM");

        Employee ram = new Manager("Ram", 20000, 3);
        Employee joe = new SecurityPersonnel("Joe", 10000, "8AM-4PM");
        Employee john = new SecurityPersonnel("John", 10000, "4PM-12AM");
        ram = new SecurityPersonnel("RAM", 100000, "General Shift");
        enterOffice(ram);
        enterOffice(joe);
        enterOffice(john);

    }

    static void enterOffice(Employee employee) {
        employee.swipeCard(); // ONE INTERFACE, BUT DIFFERENT RESPONSES
    }


}
