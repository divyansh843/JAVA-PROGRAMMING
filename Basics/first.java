 import java.util.*;
 import java.util.Scanner;

 public class first {
 
    public static void main(String arg[]){

        float a = 2.5f;
        int b = 2;
        System.out.println(a);
        

        System.out.print("Enter an integer...  ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0 ) {
            System.out.println("x is a positive integer");
        }else{
            System.out.println("x is negative integer");
        }
    }
 }