/*
 8. Write a Java program to create a class called Dog with attributes name and breed.
Create a no-argument constructor with default values and print the dog details.
 */
public class Dog {
    String name;
    String breed;


    Dog(){

        name = "Buddy";
        breed ="Labrador Retriever";
    }

    void dogDetails(){


        System.out.println("Dog name is :"+name);
        System.out.println(name+("'s breed is : "+breed));
    }


    public static void main(String[] args) {
        Dog dg= new Dog();
        dg.dogDetails();
    }
}
