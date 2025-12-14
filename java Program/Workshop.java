import java.util.Scanner;

public class Workshop {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your name:");
        String name = sc.nextLine();
 System.out.println("Enter your age:");
  int age = sc.nextInt();
  sc.nextLine(); 
 System.out.println("Enter your email:");
 String email = sc.nextLine();
  if (age < 18) {
  System.out.println("Sorry, you must be 18 or older to register.");
  } else {
     System.out.println("Registration Successful!");
     System.out.println("Name: " + name);
       System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        }

        sc.close();
    }
}
