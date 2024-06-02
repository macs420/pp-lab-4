package org.example;

import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public Company() {
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int index = 0; index < employees.length; index++) {
            if(index == 0) {
                employees[index]= new Manager(
                        "Jan Manager",
                        Math.random() * 24.1,
                        0
                );
                continue;
            }
            if (index == 1 || index == 4) {
                employees[index] = new Worker(
                        "Jan Worker",
                        Math.random() * 5.2,
                        "Konserwator powwierzchni płaskich"
                );
                continue;
            }
            employees[index] = new Employee("Jan Kowalski", Math.random() * 100.5);
        }

        Employee thirdEmployee = employees[3];
        System.out.println(thirdEmployee.toString());

        thirdEmployee.setSalary(Math.random() * 100.25);

        for (int index = 0; index < employees.length; index++) {
            System.out.println(employees[index].toString());
        }
    }
}
