public class ExceptionalHandling {
    public static void main(String[] args) {

        try {
            // Risky code (may cause exception)
            System.out.println(1 / 0);
        } 
        catch (ArithmeticException e) {
            // Handling the exception
            System.out.println(e);
        }
        finally{
            System.out.println("Finally code executes anyways ... ");
        }

        // Program continues normally
        System.out.println("Program ended safely");
    }
}
