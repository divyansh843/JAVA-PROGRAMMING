import java.util.*;

class Atm {
 public static void main(String[] arr) {
   Scanner sc = new Scanner(System.in);
    int pin, temp = 0;
   int i = 1;
 while(i <= 3) {  
   System.out.print("Enter ATM Pin: ");
    pin = sc.nextInt();

    if(pin == 777) {
  System.out.println("Welcome to SBI Bank");
     temp = 5;
     break; 
     } else {
     System.out.println("Invalid Pin");
     System.out.println("You have left " + (3-i) + " attempt(s)");
            }

        i++;
        }

        if(temp == 5) {
            System.out.println("Your transaction page");
        } else {
            System.out.println("Your ATM card is blocked");
        }

        sc.close();
    }
}
