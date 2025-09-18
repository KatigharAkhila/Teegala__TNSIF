package com.akhila2.constructor;
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingSimple {
    public static void main(String[] args) {
        Student s1 = new Student();              // Calls default constructor
        Student s2 = new Student("Akhila");      // Calls constructor with 1 parameter
        Student s3 = new Student("Ravi", 21);    // Calls constructor with 2 parameters

        s1.display();
        s2.display();
        s3.display();
    }
}
