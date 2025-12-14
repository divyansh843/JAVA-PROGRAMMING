import java.util.*;
public class Student {
 String name;
 int marks;
 Student(String name, int marks) {
   this.name = name;
   this.marks = marks;
    }

public void grade() {
   if (marks >= 90) {
   System.out.println("Grade: A");
  }
 else if (marks >= 75) {
  System.out.println("Grade: B");
  }
 else if (marks >= 50) {
    System.out.println("Grade: C");
  } 
else {
  System.out.println("Grade: F");
        }
    }
public void display() {
 System.out.println("Name: " + name);
 System.out.println("Marks: " + marks);
    }
  public static void main(String[] args) {
  Student s1 = new Student("khushi", 85);
 
s1.display();
 s1.grade();

       

        
    }
}
