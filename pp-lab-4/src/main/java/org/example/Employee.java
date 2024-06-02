package org.example;

public class Employee {
    private String fullName;
    private double salary;

    public double getSalary() {
        return this.salary;
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getName() {
        return this.fullName;
    }

    public Employee setSalary(double newSalary) {
        this.salary = newSalary;
        return this;
    }

    @Override public String toString() {
        return String.format("Employee %s, Salary: %s",this.fullName, this.salary);
    }
}
