
package com.akhila2.constructor;

class Student {
    String name;
    int age;

    // 1. No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("No-argument constructor called!");
    }

    // 2. Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called!");
    }

    // 3. Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Using no-argument constructor
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student("Akhila", 22);
        s2.display();

        // Using copy constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}
