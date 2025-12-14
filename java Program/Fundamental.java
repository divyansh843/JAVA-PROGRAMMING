import java.util.*;
class Fundamental{
public void table(int n){
for(int i=1; i<=10; i++){
System.out.println(n*i);
}
}
public void prime(int n){
int p=0;
for(int i=1; i<=n; i++){
if (n%i==0){
p++;}}
if(p==2){
System.out.println(n+"is prime Number");}
else{
System.out.println(n+"is not prime Number");
}
}
public void fact(int n){
 int fact=1;
for (int i=1; i<=n; i++)
{
fact=fact*i;
}
System.out.println("Factorial is"+fact);
}


public static void main(String[] arr){
Fundamental s=new Fundamental();
s.table(5);
s.prime(7);
s.fact(5);
}
}