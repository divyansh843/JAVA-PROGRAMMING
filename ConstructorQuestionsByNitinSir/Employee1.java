/*
 6. Write a Java program to create a class called Employee1 with attributes name and id. 
Create a constructor to initialize these attributes and print employee details.

 */
public class Employee1 {
    String name ;
    int id;
    
    Employee1(){

        name="Mahak Gupta";
        id = 101;
    }


    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        System.out.println("Name of Employee is : "+emp.name);
        System.out.println("Employee ID is : "+emp.id);
    }
}
