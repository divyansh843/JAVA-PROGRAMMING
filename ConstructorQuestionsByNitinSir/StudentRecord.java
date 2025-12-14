/*
 
26. Write a Java program to create a class called StudentRecord with attributes name,
rollNo, and marks. Create a constructor to initialize these attributes and print
details.

 */

public class StudentRecord {
    

    String name ;
    int rollNo;
    float marks;


    StudentRecord(String n, int r , float m)
    {
        name = n;
        rollNo = r;
        marks = m;
    }

     void details()
     {
         System.out.println("Student name is : "+name);
         System.out.println("Roll number is : "+rollNo);
         System.out.println("Marks Obtained : "+marks);

     }

     public static void main(String[] args) {
        StudentRecord s=new StudentRecord("Mahak", 21, 85);
        s.details(); 
     }

}
