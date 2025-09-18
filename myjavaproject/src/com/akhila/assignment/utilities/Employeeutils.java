package com.name.assignment.utilities;

import com.name.assignment.employees.Employee;

public class EmployeeUtils {
    public static double calculateBonus(Employee emp) {
        return emp.getSalary() * 0.10;
    }

    public static void displayDetails(Employee emp) {
        System.out.println(emp.getDetails());
    }
}