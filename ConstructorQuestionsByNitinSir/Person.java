/*
 10. Write a Java program to create a class called Person with attributes name and age.
Create a constructor to initialize these attributes and print the persons details.
 */
public class Person {
    String name;
    int age;

    Person(String name,int age)
    {
         this.name =name;
         this.age = age;
    }

    void personDetails()
    {
        System.out.println("Name of Person is : "+name);
        System.out.println("Age of "+name+" is : "+age);
    }

    public static void main(String[] args) {
        Person p = new Person("Mahak", 20);
        p.personDetails();
    }

}
