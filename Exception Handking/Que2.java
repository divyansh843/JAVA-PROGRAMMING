// Q2: Multiple Catch Blocks – Complete Java Program
// Problem 
// Array ka size = 5
// User index enter kare
// Do type ke exception handle hone chahiye:
// ArrayIndexOutOfBoundsException
// ArithmeticException

import java.util.Scanner;


public class Que2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int num = sc.nextInt();

        try {

            int result = arr[index] / num;   // Risky line
            System.out.println("Result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println("Program finished.");
        }

    }
}

