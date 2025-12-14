import java.util.*;
public class Car
{
    String car;
    int price;
    String colour;
    Car(String car, int price,String colour){
        this.car=car;
        this.price=price;
        this.colour=colour;
    }
    public void show(){
        System.out.println("Car Name "+car);
        System.out.println("Car Price "+price);
        System.out.println("Colour "+colour);
    }
	public static void main(String[] args) {
		Car s =new Car("Thar",500000, "black");
		s.show();
	}
}
