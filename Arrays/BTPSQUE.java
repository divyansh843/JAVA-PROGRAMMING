import java.util.*;
public class BTPSQUE {
    
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        } 
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
                
        }
        return true;
    }

    
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public static void printTable(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4,  6, 7};
        

        int primeCount = 0;
        for (int i = 0; i<arr.length; i++) {
            int n = arr[i];
            if (isPrime(n) == true) {
                primeCount++;
            }
        }

        System.out.println("\nTotal prime numbers in the array: " + primeCount);


        System.out.println("\nFactorial of each element:");
        for (int i = 0; i<arr.length; i++) {
            int n = arr[i];
            System.out.println("Factorial of " + n + " = " + factorial(n));
        }

        
        System.out.println("\nTables of all elements:");
        for (int i = 0; i<arr.length; i++) {
            int n = arr[i];
            printTable(n);
            System.out.println(); 
        }

    }
}