 import java.util.*;
 import java.util.Scanner;

public class incomeTex{

    public static void main(String arg[]){

        
        System.out.print("Enter your income...");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax = 0;

        if ( income < 500000) {
            tax  = 0;  
        }
        else if(income >= 500000 && income < 1000000){
                tax = income * 0.2f;

        }
        else{
            tax = income * 0.3f;
        }

        System.out.println(tax);


    }
}
