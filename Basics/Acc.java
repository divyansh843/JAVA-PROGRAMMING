import java.util.*;
import java.util.Scanner;

class Account{

    private int Accnum, Bal;

    public void open(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Account Number : ");
        int a = sc.nextInt();
        Accnum = a;
        System.out.print("Enter your Balance : ");
        int b = sc.nextInt();
        Bal = b;
     
    }

    public void Deposite(int amt){
        Bal = Bal + amt;

    }

    public void Withdrowl(int amt){
        if (Bal >= amt) {
            Bal = Bal - amt;
        }else{
            System.out.println("Sorry insufficient Balance");
        }
        
    }

    public void ShoeBal(){
        System.out.println("Final Balance is : " + Bal);

    }
    
}

public class Acc{

    public static void main(String[] args){
        Account a = new Account();
        a.open();
        a.Deposite(20000);
        a.Withdrowl(5000000);
        a.ShoeBal();
        
    }
    
}
