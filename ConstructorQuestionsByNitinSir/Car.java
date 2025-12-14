/*
 * 1. Write a Java program to create a class called Car with attributes brand and model.
Create a constructor to initialize these attributes and print the car details.

 */
public class Car {
    String brand;
    String model;
    
    Car(){
        brand="Hyundai";
        model="Creta";
    }

    void showDetails(){

        System.out.println("Car brand name is : "+brand);
        System.out.println("Car Model is : "+model);
    }

    public static void main(String[] args) {
        Car c =new Car();
        c.showDetails();
    }
    
}