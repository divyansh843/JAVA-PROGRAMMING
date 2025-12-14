/*
 22. Write a Java program to create a class called EmployeeRecord with attributes name,
id, and department. Create a constructor to initialize these attributes and display
them.
 */

public class EmployeeRecord
 {

    String name;
    int id ;
    String department;

    EmployeeRecord(String n, int i , String d)
    {

        name= n;
        id = i;
        department= d;
    }

    void display()
    {
        System.out.println("  Here are Employee Details : ");
        System.out.println("Name of the Employee is : "+name);
        System.out.println("Employee ID is : "+id);
        System.out.println("Department of the Employee is : "+department);
    }


    public static void main(String[] args) {
        EmployeeRecord e = new EmployeeRecord("Mahak Gupta", 201, "Computer Science");
        e.display();
    }
    
}
