public class Datatypes {
    public static void main(String[] args) {

        // Primitive Data Types
        int intVar = 100;
        double doubleVar = 99.99;
        char charVar = 'A';
        boolean boolVar = true;
        float floatVar = 10.5f;
        long longVar = 100000L;
        short shortVar = 1000;
        byte byteVar = 100; 
        
        System.out.println("Integer: " + intVar);
        System.out.println("Double: " + doubleVar); 
        System.out.println("Character: " + charVar);
        System.out.println("Boolean: " + boolVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Long: " + longVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Byte: " + byteVar);
         
         /* int is a 32-bit signed integer primitive data type in Java.
           If you want an object version of int, Java provides the wrapper class Integer. For example:
        
        int num = 5;               // primitive
        Integer objNum = 5;        // non-primitive (object) */
        
        // Reference: Wrapper class example
        Integer objInt = Integer.valueOf(intVar);
        System.out.println("Wrapper Integer Value: " + objInt);

        // Reference Data Types
        String name = "Akhila Katighar"; //

        // Non-Primitive Data Type
        String strVar = "Hello, World!";
        System.out.println("Integer Value: " + intVar);
        System.out.println("String: " + strVar);


    }
}