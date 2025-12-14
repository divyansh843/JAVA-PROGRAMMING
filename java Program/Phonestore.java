import java.util.*;
public class Phonestore{
String phone;
int price;
Phonestore(String phone,int price){
this.phone=phone;
this.price=price;

}
void show(){
System.out.println("phone Name:"+phone);
System.out.println("Phone Price:"+price);
}
public static void main(String[] arr){
Phonestore p=new Phonestore("Realme",40000);
p.show();
}
}