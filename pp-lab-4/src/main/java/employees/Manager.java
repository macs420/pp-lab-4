package employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    public Manager setNumberOfSubordinates(int newNumberOfSubordinates) {
        this.numberOfSubordinates = newNumberOfSubordinates;
        return this;
    }

    @Override public String toString() {
        return String.format("Manager %s, Salary: %s, Subordinates: %s",
                this.getName(),
                this.getSalary(),
                this.numberOfSubordinates);
    }
}
