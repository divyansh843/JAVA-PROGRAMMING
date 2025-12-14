import java.util.*;

public class constructor {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "divyansh";
        s1.roll = 345;
        s1.passward = "rolex";
        s1.Marks[0] = 100;
        s1.Marks[1] = 98;
        s1.Marks[2] = 97;

        student s2 = new student(s1); // copy
        s2.passward = "sir";
        s1.Marks[2] = 92;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.Marks[i]);
        }

    }

}

class student {
    String name;
    int roll;
    String passward;
    int Marks[];

    // shallow copy constructor
    // student(student s1) {
    // Marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.Marks = s1.Marks;
    // }

    // deep copy constructor
    student(student s1) {
        Marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < Marks.length; i++) {
            this.Marks[i] = s1.Marks[i];
        }
    }

    // non parameterized constructor
    student() {
        Marks = new int[3];
        System.out.println("constructor is called ....");
    }

    // parameterized constructor
    student(String name) {
        Marks = new int[3];
        this.name = name;

    }

    student(int roll) {
        Marks = new int[3];
        this.roll = roll;
    }
}
