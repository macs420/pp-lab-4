package org.example;

public class Company {
    public Company() {
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int index = 0; index < 5; index++) {
            employees[index] = new Employee("Jan Kowalski", Math.random() * 100.5);
        }

        Employee thirdEmployee = employees[3];
        System.out.println(thirdEmployee.toString());

        thirdEmployee.setSalary(Math.random() * 100.25);

        for (int index = 0; index < 5; index++) {
            System.out.println(employees[index].toString());
        }
    }
}
