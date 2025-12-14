import java.util.*;
class Evenodd{
public static void main(String [] arr)
{
int num;
System.out.println("Enter the Number");
Scanner a=new Scanner(System.in);
num =a.nextInt();
if(num%2==0)
{
System.out.println(num+" is Even Number");
}
else{
System.out.println(num+" is odd Number");
}
}
}