class BankAccount {

    long accountNumber;
    String name;
    double balance;

    BankAccount(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void display() {
        System.out.println("Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class Ques2 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1234, "Divyansh", 1000);

        acc.display();

        acc.deposit(500);
        acc.deposit(1200);
        acc.deposit(800);
        
        acc.withdraw(700);
        acc.withdraw(500);

    }
}