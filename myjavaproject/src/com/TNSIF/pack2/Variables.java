public class Variables {
    public static void main(String[] args) {
        int age = 22;
        double a = 22.23;
        char grade = 'A';
        String name = "Akhila Katighar";
        boolean b = true;

        // Using printf for formatted output
          
        System.out.printf("Age   : %-20d%n", age);   // -20 means left align in 20 spaces
        System.out.printf("A     : %-20.2f%n", a);   // .2f means 2 digits after decimal
        System.out.printf("Grade : %-20c%n", grade); // c is for char
        System.out.printf("Name  : %-20s%n", name);  // s is for string
        System.out.printf("Info  : %-20b%n", b);     // b is for boolean
    }
}
