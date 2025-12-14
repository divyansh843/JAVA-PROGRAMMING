/*
 7. Write a Java program to create a class called Laptop1 with attributes brand, model,
and price. Create a constructor to initialize these attributes and display them.

 */
public class Laptop1 {
    String brand;
    String model;
    double price;


    Laptop1(){
        brand="Lenovo";
        model="Ideapad Gaming";
        price= 65000.0;
    }
     String display(){

        System.out.println("Brand name is : "+brand);
        System.out.println("Model name is : "+model);
        System.out.println("Price of "+brand+" "+model+" is : "+price);
        return "Display Done";
            

     }

     public static void main(String[] args) {
        Laptop1 lap = new Laptop1();
        System.out.println(lap.display());
     }
}
