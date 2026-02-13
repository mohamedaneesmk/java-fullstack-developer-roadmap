public class ControlStatements {
    public static void main(String[] args) {

        // ==================== CONDITIONAL STATEMENTS ====================

        // 1. IF STATEMENT
        System.out.println("=== IF STATEMENT ===");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        }

        // 2. IF-ELSE STATEMENT
        System.out.println("\n=== IF-ELSE STATEMENT ===");
        int number = -5;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative or zero");
        }

        // 3. IF-ELSE-IF LADDER
        System.out.println("\n=== IF-ELSE-IF LADDER ===");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // 4. NESTED IF STATEMENT
        System.out.println("\n=== NESTED IF STATEMENT ===");
        int marks = 75;
        boolean hasAttendance = true;
        if (marks >= 50) {
            if (hasAttendance) {
                System.out.println("Pass with attendance");
            } else {
                System.out.println("Pass but no attendance");
            }
        } else {
            System.out.println("Fail");
        }

        // 5. TERNARY OPERATOR (Conditional Operator)
        System.out.println("\n=== TERNARY OPERATOR ===");
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);

        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // Nested ternary
        int num = 0;
        String status = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("Number is: " + status);

        // 6. SWITCH STATEMENT (Traditional)
        System.out.println("\n=== SWITCH STATEMENT ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 7. SWITCH WITH STRING
        System.out.println("\n=== SWITCH WITH STRING ===");
        String month = "January";
        switch (month) {
            case "January":
            case "March":
            case "May":
                System.out.println(month + " has 31 days");
                break;
            case "February":
                System.out.println(month + " has 28/29 days");
                break;
            case "April":
            case "June":
                System.out.println(month + " has 30 days");
                break;
            default:
                System.out.println("Unknown month");
        }

        // 8. SWITCH EXPRESSION (Java 12+)
        System.out.println("\n=== SWITCH EXPRESSION ===");
        int dayNum = 2;
        String dayName = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println("Day: " + dayName);

        // Switch expression with yield
        String season = switch (month) {
            case "December", "January", "February" -> "Winter";
            case "March", "April", "May" -> "Spring";
            case "June", "July", "August" -> "Summer";
            case "September", "October", "November" -> "Fall";
            default -> "Unknown";
        };
        System.out.println("Season: " + season);

        // ==================== LOOPING STATEMENTS ====================

        // 9. FOR LOOP
        System.out.println("\n=== FOR LOOP ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // For loop - counting down
        System.out.println("Countdown:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // For loop - step by 2
        System.out.println("Even numbers:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 10. NESTED FOR LOOP
        System.out.println("\n=== NESTED FOR LOOP ===");
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // Pattern printing
        System.out.println("Triangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 11. ENHANCED FOR LOOP (For-Each Loop)
        System.out.println("\n=== ENHANCED FOR LOOP ===");
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int n : numbers) {
            System.out.println("Number: " + n);
        }

        String[] fruits = { "Apple", "Banana", "Orange" };
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 12. WHILE LOOP
        System.out.println("\n=== WHILE LOOP ===");
        int count = 1;
        while (count <= 5) {
            System.out.println("While count: " + count);
            count++;
        }

        // While loop with condition
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum of 1 to 10: " + sum);

        // 13. DO-WHILE LOOP
        System.out.println("\n=== DO-WHILE LOOP ===");
        int counter = 1;
        do {
            System.out.println("Do-While count: " + counter);
            counter++;
        } while (counter <= 5);

        // Do-while executes at least once
        int x = 10;
        do {
            System.out.println("Executes even when condition is false: " + x);
        } while (x < 5);

        // ==================== JUMP STATEMENTS ====================

        // 14. BREAK STATEMENT
        System.out.println("\n=== BREAK STATEMENT ===");
        for (int j = 1; j <= 10; j++) {
            if (j == 6) {
                System.out.println("Breaking at " + j);
                break; // Exit loop when j is 6
            }
            System.out.print(j + " ");
        }
        System.out.println();

        // Break in switch (already shown above)

        // Break with label
        System.out.println("Break with label:");
    }
}