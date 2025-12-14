/*
 4. Write a Java program to create a class called Student with attributes name, rollNo,
and grade. Create a parameterized constructor to initialize these attributes and
display them.

 */

public class Student {
    
    String name;
    int rollNo;
    String grade;


    Student(String nm,int rn, String gd){
        name = nm;
        rollNo=rn;
        grade = gd;
    }


    void display(){
        System.out.println("Name of Student is : "+name);
        System.out.println("Roll number of "+name+" is : "+rollNo);
        System.out.println("Grade of "+name+" is : "+grade);
    }

    public static void main(String[] args) {
        Student st =new Student("Mahak",21,"A");
        st.display();
    }
}
