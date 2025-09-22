public class WrapperExample {
    public static void main(String[] args) {
        // Using wrapper classes instead of primitives
        Integer num = Integer.valueOf(100);     // wraps int
        Double price = Double.valueOf(99.99);   // wraps double
        Character grade = Character.valueOf('A'); // wraps char
        Boolean isPassed = Boolean.valueOf(true); // wraps boolean

        // Auto-boxing (Java automatically wraps primitive to object)
        Integer autoBoxed = 200;

        // Unboxing (Java automatically converts object to primitive)
        int unboxed = autoBoxed;

        // Display values
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + price);
        System.out.println("Character value: " + grade);
        System.out.println("Boolean value: " + isPassed);
        System.out.println("Auto-boxed Integer: " + autoBoxed);
        System.out.println("Unboxed int: " + unboxed);
    }
}