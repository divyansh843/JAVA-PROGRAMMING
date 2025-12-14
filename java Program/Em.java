import java.util.*;
class Em{
String nm;
int id;

public Em(String n, int i){
nm=n;
id=i;
}
public void disp(){
System.out.println("My name is "+nm);
System.out.println("Id is"+ id);

}
public static void main(String[] arr){
Em e2=new Em("Ram",110);
e2.disp();
}
}