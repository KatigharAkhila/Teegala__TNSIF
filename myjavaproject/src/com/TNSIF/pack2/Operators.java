public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));

        // Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int c = 5;
        c += 10; // c = c + 10
        System.out.println("c after += 10: " + c);
        c -= 5; // c = c - 5
        System.out.println("c after -= 5: " + c);
        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c);
        c /= 3; // c = c / 3
        System.out.println("c after /= 3: " + c);
        c %= 4; // c = c % 4
        System.out.println("c after %= 4: " + c);

        // Increment and Decrement Operators
        int d = 10;
        System.out.println("d :" + d);
        System.out.println("++d :"+ ++d); // Pre-increment
        System.out.println("d++ :"+ d++); // Post-increment
        System.out.println("--d :"+ --d); // Pre-decrement
        System.out.println("d-- :"+ d--); // Post-decrement

        // Unary Operators
        int e = 5;
        System.out.println("e: " + e);
        System.out.println("-e: " + (-e)); // Unary minus

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
        
    }
}