import java.util.*;
public class phonestore{
String phone;
int price;
phonestore(String phone,int price){
this.phone=phone;
this.price=price;

}
void show(){
System.out.println("phone Name:"+phone);
System.out.println("Phone Price:"+price);
}
public static void main(String[] arr){
phonestore p=new phonestore("Realme",40000);
p.disp();
}
}