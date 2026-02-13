public class DataTypesDemo {
    public static void main(String[] args) {

        // ===== Primitive Data Types =====

        byte b = 10;              // 1 byte
        short s = 100;            // 2 bytes
        int i = 21;               // 4 bytes
        long l = 9876543210L;     // 8 bytes

        float f = 3.14f;          // 4 bytes
        double d = 99.99;         // 8 bytes

        char c = 'A';             // 2 bytes
        boolean flag = true;      // 1 bit

        // Printing primitive values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // ===== Non-Primitive (Reference) Data Types =====

        String name = "Anees";              // String
        int[] numbers = {1, 2, 3, 4};       // Array

        // Printing non-primitive values
        System.out.println("String: " + name);
        System.out.println("Array element: " + numbers[0]);
    }
}
