public class StaticDemo {
    static int count = 0; // static variable shared by all instances

    public StaticDemo() {
        count++; // increment count whenever a new object is created
    }

    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();

        StaticDemo.displayCount(); // Output: Total objects created: 3
    }
}