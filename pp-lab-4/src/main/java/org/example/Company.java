package org.example;

import employees.Employee;
import employees.Manager;
import employees.Worker;

import java.util.Arrays;

public class Company {
    public Company() {
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        for (int index = 0; index < employees.length; index++) {
            if (index == 0 || index == 5) {
                employees[index] = new Manager(
                        "Jan Manager",
                        Math.random() * 24.1,
                        0
                );
                continue;
            }
            if (index == 1 || index == 4 || index == 6) {
                employees[index] = new Worker(
                        "Jan Worker",
                        Math.random() * 5.2,
                        "Konserwator powwierzchni płaskich"
                );
                continue;
            }
            employees[index] = new Employee("Jan Kowalski", Math.random() * 100.5);
        }

        Arrays.stream(employees).map(employee -> {
            employee.setSalary(employee.getSalary() + 500);
            return employee;
        });

        Employee thirdEmployee = employees[3];
        System.out.println(thirdEmployee.toString());

        thirdEmployee.setSalary(Math.random() * 100.25);

        int subordinates = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] instanceof Manager) {
                continue;
            }

            subordinates++;
        }

        ((Manager) employees[0])
                .setNumberOfSubordinates(subordinates)
                .setSalary(7500);

        ((Manager) employees[5])
                .setNumberOfSubordinates(subordinates)
                .setSalary(7500);

        for (int index = 0; index < employees.length; index++) {
            System.out.println(employees[index].toString());
        }
    }
}
