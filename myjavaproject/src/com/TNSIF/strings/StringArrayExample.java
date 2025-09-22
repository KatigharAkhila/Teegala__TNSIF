public class StringArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a string array
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple"};

        // Print all elements using a loop
        System.out.println("Colors in the array:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // Access and modify an element
        colors[2] = "Sky Blue";
        System.out.println("\nUpdated third color: " + colors[2]);

        // Enhanced for loop
        System.out.println("\nAll colors using enhanced for loop:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}