/*
12. Write a Java program to create a class called BankAccount with attributes accountNumber
and balance. Create a constructor to initialize these attributes and print account
details.
*/
public class BankAccount {
    
     long accountNumber;
     double balance;


     BankAccount(){

        accountNumber=454145412141l;
        balance= 4526.1;

     }

     void details(){
        System.out.println("Account Number is : "+accountNumber);
        System.out.println("Balance is :"+balance
        );
     }


     public static void main(String[] args) {
        BankAccount b =new BankAccount();
        b.details();
     }
}
