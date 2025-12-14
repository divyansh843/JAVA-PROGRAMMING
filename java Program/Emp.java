import java.util.*;

public class Emp{
    private int age;
    String nm;
    double salary;
    int id;
 public void setval(int a, String b) {
  id = a;
  nm = b;
    }

 public void setsalary(int age) {
   this.age = age; 
  if (age >= 20 && age <= 50) {
            salary = 50000;
        } else if (age > 50) {
            salary = 70000;
        } else
            salary = 0;
    }

    public void showsalary() {
        System.out.println("Salary is " + salary);
    }
}

class Test {
    public static void main(String[] arr) {
        Dem s = new Dem();
        s.setval(101, "Ram"); 
        s.setsalary(20);      
        s.showsalary();      
    }
}

Emp s= new Emp();
s.setsalary(101 ,"Ram" ,20);
s.showsalary();

}
}
