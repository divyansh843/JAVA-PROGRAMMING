/*
11. Write a Java program to create a class called Mobile with attributes brand and
price. Create a constructor to initialize these attributes and display mobile details.
 */
public class Mobile {
     
    String brand;
    double price;

    Mobile(){
        brand = "Redmi";
        price = 15000.0;
    }

    void displayDetails()
{

    System.out.println(" Brand Name is : "+brand);
    System.out.println("Price of "+brand+" is : "+price);

}

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.displayDetails();
    }

}
