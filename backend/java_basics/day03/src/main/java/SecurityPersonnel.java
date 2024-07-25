public class SecurityPersonnel extends Employee {
    private String shiftTime;

    public SecurityPersonnel(String name, double salary, String shiftTime) {
        super(name, salary);
        this.shiftTime = shiftTime;
    }

    @Override
    public void swipeCard() {
        System.out.println("**SecurityPersonnel %s entering at this shift %s".formatted(getName(), shiftTime));
    }
}
