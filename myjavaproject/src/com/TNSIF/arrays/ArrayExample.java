public class ArrayExample {
    public static void main(String[] args) {
        // 1. Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Access and print specific elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // 3. Modify an element
        numbers[1] = 25;
        System.out.println("Updated second element: " + numbers[1]);

        // 4. Iterate using a for loop
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 5. Iterate using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 6. Declare and initialize a String array
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println("Fruit list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}