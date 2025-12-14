import java.util.*;
class Bank{
private int accno,bal;
public void open(int a, int b)
{
accno=a;
bal=b;
}
public void deposit(int amt)
{
bal=bal+amt;
}
public void withdraw(int amt)
{
if (bal>amt)
{
bal=bal-amt;
}
else{
System.out.println("Sorry insuffienct Balance");
}}
public  void showbal(){
System.out.println("Final Balnce is "+bal);
}
public static void main(String[] arr){
Bank s=new Bank();
s.open(211,4000);
s.deposit(3000);
s.deposit(20000);
s.showbal();
}



}
