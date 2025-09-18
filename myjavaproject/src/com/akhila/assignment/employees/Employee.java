package com.name.assignment.employees;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public void setDetails(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }

    public double getSalary() {
        return salary;
    }
}