/*
 15. Write a Java program to create a class called Vehicle with attributes type and
speed. Create a no-argument constructor with default values and print vehicle
details.
 */

public class Vehicle 

{
    
    String type;
    int speed;


    Vehicle()
    {
        type= " Four Wheeler";
        speed =52  ;
    }


    public static void main(String[] args)
    
    {
        Vehicle v = new Vehicle();
        System.out.println("Vehicle Type is : "+v.type);
        System.out.println("Speed of the Vehicle is : "+v.speed+" km/hr . ");
    }
}
