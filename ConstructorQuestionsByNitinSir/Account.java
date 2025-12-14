/*
 * 24. Write a Java program to create a class called Account with attributes accountHolder
and balance. Create a constructor to initialize these attributes and display account
details.
 */

public class Account {
    
    String accountHolder;
    double balance;

    Account(String accH,double bal )
    {
        accountHolder=accH;
        balance = bal;
    }

    void details()
    {
             System.out.println("Name of Account Holder is : "+accountHolder);
             System.out.println("Balance is : "+balance+" Rs.");

    }

    public static void main(String[] args) {
        Account ac = new Account("Mahak Gupta", 45.5);
        ac.details();
    }
    
}
