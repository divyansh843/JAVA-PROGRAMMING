// Q1: Division Program with Exception Handling
// Question
// User se:
// 2 numbers input lene hain
// Division karna hai
// Agar division by zero ho to exception handle karna hai

import java.util.Scanner;
public class Que1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            

            int result = a / b;   // Risky code
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        System.out.println("Program executed successfully.");
        
    }
}

