import java.util.*;
class Result{


public void marks(){

Scanner s =new Scanner(System.in);

int h ,e,m,b,d;



System.out.print("Enter the  Hindi Number");
h=s.nextInt();
System.out.print("Enter the English Number");
e=s.nextInt();
System.out.print("Enter the Math Number");
m=s.nextInt();
System.out.print("Enter the Science Number");
b=s.nextInt();
System.out.print("Enter the  Drawing Number");
d=s.nextInt();
if(h>=33&&e>=33&&m>=33&&d>=33&&d>=33){
System.out.print("Your are Passed");
}
else{
System.out.println("Your are Failed");
}}
public static void main(String[] arr){
Result s=new Result();

s.marks();
}
}