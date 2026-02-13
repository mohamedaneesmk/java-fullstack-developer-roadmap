public class MethodsAndConstructors {
    
    // ==================== INSTANCE VARIABLES ====================
    private String name;
    private int age;
    private double salary;
    private static int objectCount = 0;
    
    // ==================== CONSTRUCTORS ====================
    
    // 1. DEFAULT CONSTRUCTOR (No-argument constructor)
    public MethodsAndConstructors() {
        System.out.println("Default constructor called");
        this.name = "Unknown";
        this.age = 0;
        this.salary = 0.0;
        objectCount++;
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR
    public MethodsAndConstructors(String name, int age) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
        this.salary = 0.0;
        objectCount++;
    }
    
    // 3. CONSTRUCTOR WITH ALL PARAMETERS
    public MethodsAndConstructors(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        objectCount++;
    }
    
    // 4. COPY CONSTRUCTOR
    public MethodsAndConstructors(MethodsAndConstructors other) {
        System.out.println("Copy constructor called");
        this.name = other.name;
        this.age = other.age;
        this.salary = other.salary;
        objectCount++;
    }
    
    // 5. CONSTRUCTOR CHAINING (using this())
    public MethodsAndConstructors(String name) {
        this(name, 18);  // Calls constructor with 2 parameters
        System.out.println("Constructor with name only");
    }
    
    
    // ==================== METHODS - BASIC ====================
    
    // 6. METHOD WITH NO PARAMETERS AND NO RETURN TYPE
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
    
    // 7. METHOD WITH PARAMETERS AND NO RETURN TYPE
    public void setDetails(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // 8. METHOD WITH NO PARAMETERS AND RETURN TYPE
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    // 9. METHOD WITH PARAMETERS AND RETURN TYPE
    public int calculateYearsToRetirement(int retirementAge) {
        return retirementAge - this.age;
    }
    
    public double calculateAnnualTax(double taxRate) {
        return this.salary * taxRate;
    }
    
    
    // ==================== STATIC METHODS ====================
    
    // 10. STATIC METHOD (Class method)
    public static int getObjectCount() {
        return objectCount;
    }
    
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to the Employee Management System");
        // Note: Cannot access instance variables directly in static methods
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    
    // ==================== METHOD OVERLOADING ====================
    
    // 11. METHOD OVERLOADING (Same name, different parameters)
    
    // Overloaded methods - different number of parameters
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Overloaded methods - different types of parameters
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public String multiply(String str, int times) {
        return str.repeat(times);
    }
    
    // Overloaded display methods
    public void display(int num) {
        System.out.println("Integer: " + num);
    }
    
    public void display(String text) {
        System.out.println("String: " + text);
    }
    
    public void display(int num, String text) {
        System.out.println("Number: " + num + ", Text: " + text);
    }
    
    
    // ==================== VARIABLE ARGUMENTS (VARARGS) ====================
    
    // 12. VARARGS METHOD
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public void printAll(String... items) {
        System.out.print("Items: ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    // Varargs with other parameters (varargs must be last)
    public void displayMessage(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    
    // ==================== RECURSIVE METHODS ====================
    
    // 13. RECURSIVE METHOD
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call
    }
    
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }
    
    
    // ==================== GETTER AND SETTER METHODS ====================
    
    // 14. GETTERS (Accessor methods)
    public String getNameUpperCase() {
        return this.name.toUpperCase();
    }
    
    // 15. SETTERS (Mutator methods)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
    
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
    
    
    // ==================== METHODS WITH DIFFERENT ACCESS MODIFIERS ====================
    
    // 16. PUBLIC METHOD
    public void publicMethod() {
        System.out.println("This is a public method - accessible everywhere");
    }
    
    // 17. PRIVATE METHOD
    private void privateMethod() {
        System.out.println("This is a private method - only within this class");
    }
    
    // 18. PROTECTED METHOD
    protected void protectedMethod() {
        System.out.println("This is a protected method - accessible in package and subclasses");
    }
    
    // 19. DEFAULT (PACKAGE-PRIVATE) METHOD
    void defaultMethod() {
        System.out.println("This is a default method - accessible within package");
    }
    
    // Helper method to call private method
    public void callPrivateMethod() {
        privateMethod();
    }
    
    
    // ==================== FINAL METHODS ====================
    
    // 20. FINAL METHOD (Cannot be overridden)
    public final void finalMethod() {
        System.out.println("This method cannot be overridden");
    }
    
    
    // ==================== METHOD WITH OBJECT PARAMETER ====================
    
    // 21. METHOD ACCEPTING OBJECT
    public boolean isSameAge(MethodsAndConstructors other) {
        return this.age == other.age;
    }
    
    public void copyFrom(MethodsAndConstructors other) {
        this.name = other.name;
        this.age = other.age;
        this.salary = other.salary;
    }
    
    
    // ==================== METHOD RETURNING OBJECT ====================
    
    // 22. METHOD RETURNING OBJECT
    public MethodsAndConstructors clone() {
        return new MethodsAndConstructors(this.name, this.age, this.salary);
    }
    
    
    // ==================== METHOD WITH ARRAY PARAMETERS ====================
    
    // 23. METHOD WITH ARRAY PARAMETER
    public int findMax(int[] numbers) {
        if (numbers.length == 0) return 0;
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public void printArray(String[] items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
    
    // 24. METHOD RETURNING ARRAY
    public int[] getFirstNNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
    
    
    // ==================== UTILITY METHODS ====================
    
    // 25. toString() METHOD
    @Override
    public String toString() {
        return "MethodsAndConstructors{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
    
    // 26. equals() METHOD
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MethodsAndConstructors other = (MethodsAndConstructors) obj;
        return age == other.age && 
               Double.compare(other.salary, salary) == 0 && 
               name.equals(other.name);
    }
    
    
    // ==================== MAIN METHOD ====================
    
    public static void main(String[] args) {
        
        System.out.println("=== CONSTRUCTORS ===\n");
        
        // Default constructor
        MethodsAndConstructors obj1 = new MethodsAndConstructors();
        obj1.displayInfo();
        
        System.out.println();
        
        // Parameterized constructor
        MethodsAndConstructors obj2 = new MethodsAndConstructors("Alice", 25);
        obj2.displayInfo();
        
        System.out.println();
        
        // Constructor with all parameters
        MethodsAndConstructors obj3 = new MethodsAndConstructors("Bob", 30, 75000.50);
        obj3.displayInfo();
        
        System.out.println();
        
        // Copy constructor
        MethodsAndConstructors obj4 = new MethodsAndConstructors(obj3);
        System.out.println("Copied object:");
        obj4.displayInfo();
        
        System.out.println();
        
        // Constructor chaining
        MethodsAndConstructors obj5 = new MethodsAndConstructors("Charlie");
        
        System.out.println("\n=== BASIC METHODS ===\n");
        
        // Methods with parameters and return type
        System.out.println("Name: " + obj3.getName());
        System.out.println("Age: " + obj3.getAge());
        System.out.println("Years to retirement: " + obj3.calculateYearsToRetirement(65));
        System.out.println("Annual tax (20%): $" + obj3.calculateAnnualTax(0.20));
        
        System.out.println("\n=== STATIC METHODS ===\n");
        
        // Static methods
        displayWelcomeMessage();
        System.out.println("Total objects created: " + getObjectCount());
        System.out.println("Addition: " + add(10, 20));
        System.out.println("Circle area: " + calculateCircleArea(5.0));
        
        System.out.println("\n=== METHOD OVERLOADING ===\n");
        
        // Method overloading
        MethodsAndConstructors obj = new MethodsAndConstructors("Test", 25, 50000);
        System.out.println("2 integers: " + obj.multiply(5, 3));
        System.out.println("3 integers: " + obj.multiply(2, 3, 4));
        System.out.println("2 doubles: " + obj.multiply(2.5, 4.0));
        System.out.println("String repeat: " + obj.multiply("Hello", 3));
        
        obj.display(100);
        obj.display("Hello World");
        obj.display(42, "Answer");
        
        System.out.println("\n=== VARARGS ===\n");
        
        // Varargs
        System.out.println("Sum of 2 numbers: " + obj.sum(10, 20));
        System.out.println("Sum of 5 numbers: " + obj.sum(1, 2, 3, 4, 5));
        System.out.println("Sum of 0 numbers: " + obj.sum());
        
        obj.printAll("Apple", "Banana", "Cherry");
        obj.displayMessage("Numbers", 1, 2, 3, 4, 5);
        
        System.out.println("\n=== RECURSIVE METHODS ===\n");
        
        // Recursive methods
        System.out.println("Factorial of 5: " + obj.factorial(5));
        System.out.println("Fibonacci of 7: " + obj.fibonacci(7));
        System.out.println("Sum of digits (12345): " + obj.sumOfDigits(12345));
        
        // Print Fibonacci series
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
        System.out.println();
        
        System.out.println("\n=== GETTERS AND SETTERS ===\n");
        
        // Getters and Setters
        obj.setName("UpdatedName");
        obj.setAge(28);
        obj.setSalary(60000);
        System.out.println("Updated name: " + obj.getName());
        System.out.println("Name uppercase: " + obj.getNameUpperCase());
        obj.displayInfo();
        
        System.out.println("\n=== ACCESS MODIFIERS ===\n");
        
        // Access modifiers
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.callPrivateMethod();  // Calling private method through public method
        obj.finalMethod();
        
        System.out.println("\n=== OBJECT PARAMETERS AND RETURNS ===\n");
        
        // Methods with object parameters
        MethodsAndConstructors obj6 = new MethodsAndConstructors("David", 25, 55000);
        MethodsAndConstructors obj7 = new MethodsAndConstructors("Eve", 25, 58000);
        System.out.println("Same age? " + obj6.isSameAge(obj7));
        
        // Clone object
        MethodsAndConstructors clonedObj = obj6.clone();
        System.out.println("Cloned object: " + clonedObj);
        
        System.out.println("\n=== ARRAY METHODS ===\n");
        
        // Array methods
        int[] numbers = {10, 50, 30, 90, 20};
        System.out.println("Max number: " + obj.findMax(numbers));
        
        int[] generatedNumbers = obj.getFirstNNumbers(5);
        System.out.print("Generated numbers: ");
        for (int num : generatedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("Array elements:");
        obj.printArray(fruits);
        
        System.out.println("\n=== UTILITY METHODS ===\n");
        
        // toString method
        System.out.println("Object details: " + obj6.toString());
        
        // equals method
        MethodsAndConstructors obj8 = new MethodsAndConstructors("David", 25, 55000);
        System.out.println("obj6 equals obj8? " + obj6.equals(obj8));
        System.out.println("obj6 equals obj7? " + obj6.equals(obj7));
        
        System.out.println("\n=== METHOD CHAINING EXAMPLE ===\n");
        
        // Demonstrating method usage
        MethodsAndConstructors employee = new MethodsAndConstructors();
        employee.setName("John Doe");
        employee.setAge(35);
        employee.setSalary(80000);
        employee.displayInfo();
    }
}


// ==================== ADDITIONAL CLASS FOR DEMONSTRATION ====================

class Calculator {
    
    // 27. STATIC UTILITY CLASS
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
    
    // 28. METHOD WITH EXCEPTION HANDLING
    public static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}


// ==================== METHOD CHAINING EXAMPLE ====================

class Person {
    private String name;
    private int age;
    private String city;
    
    public Person() {
        this.name = "";
        this.age = 0;
        this.city = "";
    }
    
    // 29. METHOD CHAINING (Returning 'this')
    public Person setName(String name) {
        this.name = name;
        return this;  // Return current object
    }
    
    public Person setAge(int age) {
        this.age = age;
        return this;
    }
    
    public Person setCity(String city) {
        this.city = city;
        return this;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
    
    // Example usage
    public static void demonstrateChaining() {
        System.out.println("\n=== METHOD CHAINING ===\n");
        Person p = new Person()
                    .setName("Alice")
                    .setAge(28)
                    .setCity("New York");
        p.display();
    }
}