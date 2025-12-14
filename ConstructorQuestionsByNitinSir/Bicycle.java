/*
 27. Write a Java program to create a class called Bicycle with attributes brand and
speed. Create a no-argument constructor with default values and display bicycle
details.
 */
public class Bicycle {
    
    String brand;
    int speed;

    Bicycle()
    {
        brand= "Herculus";
        speed= 15;
    }

    void details()
    {
        System.out.println("Bicycle brand name is : "+brand);
        System.out.println("Spped is : "+speed+" km/hr .");
    }

    public static void main(String[] args) {
        Bicycle b =new Bicycle();
        b.details();
    }
}
