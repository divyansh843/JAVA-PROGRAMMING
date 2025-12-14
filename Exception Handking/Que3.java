// Q3: Finally Block – Complete Java Program
// Question 
// Aisa program banana hai jisme:
// Try block me risky code ho
// Exception aaye ya na aaye
// finally block hamesha execute ho



public class Que3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // Risky code
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        finally {
            System.out.println("Finally block executed: Resources closed.");
        }

        System.out.println("Program ended normally.");
    }
}

