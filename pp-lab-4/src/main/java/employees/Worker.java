package employees;

public class Worker extends Employee {
    public String position;

    public String getPosition() {
        return this.position;
    }

    public Worker setPosition(String newPosition) {
        this.position = newPosition;
        return this;
    }

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    @Override public String toString(){
        return String.format("Worker %s, Salary: %s, Position: %s",
                this.getName(),
                this.getSalary(),
                this.position);
    }
}
