public class DataTypes {
    public static void main(String[] args) {
        // 1. Primitive Data Types
        
        // Integer types
        byte myByte = 127;                    // 8-bit, range: -128 to 127
        short myShort = 32000;                // 16-bit, range: -32,768 to 32,767
        int myInt = 2147483647;               // 32-bit, range: -2^31 to 2^31-1
        long myLong = 9223372036854775807L;   // 64-bit, range: -2^63 to 2^63-1 (note the 'L')
        
        // Floating-point types
        float myFloat = 3.14f;                // 32-bit, single precision (note the 'f')
        double myDouble = 3.14159265359;      // 64-bit, double precision
        
        // Character type
        char myChar = 'A';                    // 16-bit Unicode character
        char unicodeChar = '\u0041';          // Unicode representation of 'A'
        
        // Boolean type
        boolean isTrue = true;                // true or false
        boolean isFalse = false;
        
        
        // 2. Reference Data Types
        
        // String (most commonly used reference type)
        String myString = "Hello, Java!";
        String emptyString = "";
        
        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry"};
        double[][] twoDArray = {{1.1, 2.2}, {3.3, 4.4}};
        
        // Wrapper Classes (Object versions of primitives)
        Integer wrapperInt = 100;             // Autoboxing
        Double wrapperDouble = 3.14;
        Character wrapperChar = 'B';
        Boolean wrapperBoolean = true;
        
        
        // 3. Type Casting
        
        // Widening (implicit/automatic)
        int smallInt = 100;
        long bigLong = smallInt;              // int to long
        double bigDouble = smallInt;          // int to double
        
        // Narrowing (explicit/manual)
        double largeDouble = 9.78;
        int castInt = (int) largeDouble;      // double to int (loses decimal part)
        
        
        // 4. Special Values
        
        // Infinity and NaN for floating-point
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double notANumber = Double.NaN;
        
        // Min and Max values
        int maxInt = Integer.MAX_VALUE;       // 2147483647
        int minInt = Integer.MIN_VALUE;       // -2147483648
        
        
        // 5. Constants (final keyword)
        final double PI = 3.14159;            // Cannot be changed
        final int MAX_USERS = 100;
        
        
        // 6. Default Values (for class fields, not local variables)
        // byte, short, int, long: 0
        // float, double: 0.0
        // char: '\u0000' (null character)
        // boolean: false
        // Reference types: null
        
        
        // 7. Literals
        int decimalLiteral = 100;             // Decimal (base 10)
        int binaryLiteral = 0b1100100;        // Binary (base 2)
        int octalLiteral = 0144;              // Octal (base 8)
        int hexLiteral = 0x64;                // Hexadecimal (base 16)
        
        // Underscore in numeric literals (Java 7+)
        int million = 1_000_000;
        long creditCard = 1234_5678_9012_3456L;
        
        
        // 8. Type Inference (var keyword - Java 10+)
        var inferredInt = 42;                 // Inferred as int
        var inferredString = "Hello";         // Inferred as String
        var inferredDouble = 3.14;            // Inferred as double
        
        
        // Printing examples
        System.out.println("=== Primitive Types ===");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + isTrue);
        
        System.out.println("\n=== Reference Types ===");
        System.out.println("String: " + myString);
        System.out.println("Array element: " + intArray[0]);
        System.out.println("Wrapper Integer: " + wrapperInt);
        
        System.out.println("\n=== Type Casting ===");
        System.out.println("Original double: " + largeDouble);
        System.out.println("Cast to int: " + castInt);
        
        System.out.println("\n=== Special Values ===");
        System.out.println("Max int: " + maxInt);
        System.out.println("Positive Infinity: " + positiveInfinity);
        
        System.out.println("\n=== Literals ===");
        System.out.println("Decimal: " + decimalLiteral);
        System.out.println("Binary: " + binaryLiteral);
        System.out.println("Hex: " + hexLiteral);
        System.out.println("Million: " + million);
    }
}