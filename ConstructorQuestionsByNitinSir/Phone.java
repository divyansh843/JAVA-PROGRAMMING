/*
 23. Write a Java program to create a class called Phone with attributes brand and
model. Create a constructor to initialize these attributes and print phone details.
 */
public class Phone {
    
    String brand;
    String model ;


    Phone(String brand , String model )
    {
        this. brand = brand;
        this.model = model;
    }

    void details()
    {

        System.out.println("  Phone Details are :  ");
        System.out.println("Brand of the Phone is : "+brand);
        System.out.println("Model of the Phone is : "+model);
    }

    public static void main(String[] args) {
        Phone p = new Phone("Lava","Blaze 3");
        p.details();
    }
}
