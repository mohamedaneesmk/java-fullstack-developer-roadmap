public class Variable {
    // 1. Instance Variables (Non-static fields)
    int instanceVar = 10;
    String instanceName = "Instance";
    
    // 2. Class Variables (Static fields)
    static int staticVar = 20;
    static String companyName = "TechCorp";
    
    // 3. Constants (final variables)
    static final double PI = 3.14159;
    static final int MAX_SPEED = 120;
    final String COUNTRY = "USA";  // Instance constant
    
    public static void main(String[] args) {
        // 4. Local Variables (declared inside methods)
        int x = 123;
        double y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Bro";

        System.out.println("=== Basic Variables ===");
        System.out.println("Integer : " + x);
        System.out.println("Float : " + y);
        System.out.println("Boolean : " + z);
        System.out.println("Character : " + symbol);
        System.out.println("Hello " + name);
        
        // 5. Variable Naming Conventions
        int studentAge = 20;              // camelCase for variables
        String firstName = "John";        // camelCase
        final int MAX_VALUE = 100;        // UPPER_CASE for constants
        
        // 6. Multiple Variable Declaration
        int a = 5, b = 10, c = 15;
        String city = "NYC", state = "NY";
        
        // 7. Variable Initialization
        int uninitializedVar;             // Declaration only
        uninitializedVar = 50;            // Initialization later
        
        int initializedVar = 100;         // Declaration + Initialization
        
        // 8. Variable Scope Examples
        int outerScope = 1;
        {
            int innerScope = 2;           // Block scope
            System.out.println("\n=== Scope ===");
            System.out.println("Outer: " + outerScope);
            System.out.println("Inner: " + innerScope);
        }
        // System.out.println(innerScope); // ERROR: out of scope
        
        // 9. Variable Reassignment
        int count = 5;
        System.out.println("\n=== Reassignment ===");
        System.out.println("Initial count: " + count);
        count = 10;                       // Reassignment
        System.out.println("Updated count: " + count);
        count += 5;                       // Compound assignment
        System.out.println("After += 5: " + count);
        
        // 10. Type Inference (var keyword - Java 10+)
        var inferredInt = 42;             // Type inferred as int
        var inferredString = "Hello";     // Type inferred as String
        var inferredBool = true;          // Type inferred as boolean
        
        System.out.println("\n=== Type Inference (var) ===");
        System.out.println("Inferred int: " + inferredInt);
        System.out.println("Inferred String: " + inferredString);
        
        // 11. Accessing Static Variables
        System.out.println("\n=== Static Variables ===");
        System.out.println("Static variable: " + staticVar);
        System.out.println("Company: " + companyName);
        System.out.println("PI constant: " + PI);
        
        // 12. Accessing Instance Variables (need object)
        Variable obj = new Variable();
        System.out.println("\n=== Instance Variables ===");
        System.out.println("Instance variable: " + obj.instanceVar);
        System.out.println("Instance name: " + obj.instanceName);
        System.out.println("Instance constant: " + obj.COUNTRY);
        
        // 13. Variable Shadowing
        int shadowVar = 100;
        {
            int shadowVar1 = 200;          // Different variable (shadows outer)
            System.out.println("\n=== Variable Shadowing ===");
            System.out.println("Inner shadowVar: " + shadowVar1);
        }
        System.out.println("Outer shadowVar: " + shadowVar);
        
        // 14. String Variables - Special Operations
        String greeting = "Hello";
        String fullGreeting = greeting + " " + name;  // Concatenation
        System.out.println("\n=== String Operations ===");
        System.out.println("Concatenated: " + fullGreeting);
        System.out.println("Length: " + fullGreeting.length());
        System.out.println("Uppercase: " + fullGreeting.toUpperCase());
        
        // 15. Wrapper Class Variables (Reference types)
        Integer wrapperInt = 100;         // Autoboxing
        Double wrapperDouble = 3.14;
        Boolean wrapperBool = true;
        
        System.out.println("\n=== Wrapper Classes ===");
        System.out.println("Integer object: " + wrapperInt);
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        
        // 16. Array Variables
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.println("\n=== Array Variables ===");
        System.out.println("First number: " + numbers[0]);
        System.out.println("First name: " + names[0]);
        System.out.println("Array length: " + numbers.length);
        
        // 17. Null Variables
        String nullString = null;
        Integer nullInteger = null;
        
        System.out.println("\n=== Null Variables ===");
        System.out.println("Null string: " + nullString);
        
        // 18. Final Variables (Constants)
        final int IMMUTABLE = 999;
        // IMMUTABLE = 100;               // ERROR: cannot reassign
        
        System.out.println("\n=== Final Variables ===");
        System.out.println("Immutable value: " + IMMUTABLE);
        System.out.println("MAX_SPEED constant: " + MAX_SPEED);
        
        // 19. Multiple Variables Declaration
        System.out.println("\n=== Multiple Declarations ===");
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        
        // 20. Variable Increment/Decrement
        int counter = 0;
        counter++;                        // Post-increment
        ++counter;                        // Pre-increment
        System.out.println("\n=== Increment/Decrement ===");
        System.out.println("Counter: " + counter);
        
        int value = 10;
        System.out.println("Post-increment: " + value++);  // Prints 10, then increments
        System.out.println("After post-increment: " + value);
        System.out.println("Pre-increment: " + ++value);   // Increments, then prints
    }
    
    // 21. Method Parameters (special type of local variables)
    public static void printMessage(String message) {
        // 'message' is a parameter variable
        System.out.println("Parameter: " + message);
    }
    
    // 22. Method with multiple parameters
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;            // Local variable in method
        return sum;
    }
}