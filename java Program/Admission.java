import java.util.*;

class Admission {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    System.out.print("Enter age: ");
   int age = sc.nextInt();

  if (age >= 5 && age <= 15) {
System.out.println(name + " is eligible for admission.");
 } else {
System.out.println(name + " is not eligible for admission.");
        }
    }
}
