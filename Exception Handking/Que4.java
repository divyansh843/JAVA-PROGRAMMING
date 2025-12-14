// Q4: Custom Exception – InvalidAgeException
// Problem 
// Ek custom (user-defined) exception banana hai
// Name: InvalidAgeException
// Agar age < 18 ho → exception throw karo
// Warna print karo: "Valid for voting"

import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}


public class Que4 {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Not valid for voting");
        }
        else {
            System.out.println("Valid for voting");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);   // Method calling
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    
    }
}
