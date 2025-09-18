
package com.akhila2.constructor.com.method;
class Calculator {

    // 1. Different number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Different types of parameters
    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + " " + b;
    }

    // 3. Different sequence of parameters
    void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    void show(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Number of parameters
        System.out.println("Sum (2 ints): " + calc.add(10, 20));
        System.out.println("Sum (3 ints): " + calc.add(10, 20, 30));

        // Types of parameters
        System.out.println("Sum (2 doubles): " + calc.add(5.5, 6.7));
        System.out.println("Concatenation: " + calc.add("Hello", "World"));

        // Sequence of parameters
        calc.show(100, "Akhila");
        calc.show("Akhila", 100);
    }
}
