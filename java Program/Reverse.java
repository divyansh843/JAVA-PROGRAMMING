import java.util.*;
class Reverse{
public static void main(String[] arr){
String nm; 
System.out.println("Enter Your name ");
Scanner s=new Scanner(System.in);
nm =s.nextLine();
for(int i=nm.length()-1;i>=0;i--)
System.out.println(nm.charAt(i));
}
}d