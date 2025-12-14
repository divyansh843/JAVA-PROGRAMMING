 import java.util.*;
 import java.util.Scanner;

public class Calculator {

    public static void main (String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter your operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        
        switch(operator){
            case '+' : System.out.print(a+b);
            break;
            case '-' : System.out.print(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Wrong operator ");
        }
        
    }
    
}
