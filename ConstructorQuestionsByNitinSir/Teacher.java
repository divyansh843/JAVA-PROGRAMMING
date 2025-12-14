/*
 14. Write a Java program to create a class called Teacher with attributes name and
subject. Create a constructor to initialize these attributes and display teacher
details.
 */

public class Teacher {
    
    String name;
    String subject;

    Teacher(){
        name = "Nitin Sir ";
        subject= "Java";
    }
    void teacherDetails(){


        System.out.println("Name of the teacher is : "+name);
        System.out.println("Subject of "+name+" is : "+subject);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.teacherDetails();
    }
}
