import java.util.*;
public class Laptop
{
    String laptop;
    int price;
    
    Laptop(String laptop, int price){
        this.laptop=laptop;
        this.price=price;
      
    }
    public void show(){
        System.out.println("Laptop Name "+laptop);
        System.out.println("Laptop Price "+price);
        
    }
	public static void main(String[] args) {
		Laptop s =new Laptop("Lenovo",50000);
		s.show();
	}
}
