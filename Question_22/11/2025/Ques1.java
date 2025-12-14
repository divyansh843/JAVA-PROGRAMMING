// Q1. Student Management System (Array + Class)
// Create a program to store 5 Students (id, name, marks).
// Find and display the student with highest marks.
// (Real project use: ranking/toppers list)

class student {
    int id;
    String name;
    int marks;

    student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

}

public class Ques1 {

    public static void main(String[] args) {
        student std[] = new student[5];

        std[0] = new student(1, "Divynash", 99);
        std[1] = new student(2, "Rishabh", 98);
        std[2] = new student(3, "Mohini", 97);
        std[3] = new student(4, "Abhishek", 95);
        std[4] = new student(1, "yashveer", 96);


        student toppStudent = std[0];
        for (int i = 1; i < std.length; i++) {
            if (toppStudent.marks < std[i].marks) {
                toppStudent = std[i];

            }
            
        }


        System.out.println("topper student marks : " + toppStudent.marks);
        System.out.println("id : " + toppStudent.id);
        System.out.println("name : " + toppStudent.name);
        System.out.println("marks : " + toppStudent.marks);
        
    }
    
}
