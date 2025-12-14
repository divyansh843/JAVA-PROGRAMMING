import java.util.*;
class Cal {
  int a, b, c;

 void add() {
  c = a + b;
  System.out.println("Sum is " + c);
    }

 void mult() {
  c = a * b;
  System.out.println("Multiplication is " + c);
    }

    public static void main(String[] args) {
     Cal obj = new Cal(); // Correct class name
      obj.a = 10;
     obj.b = 7;
     obj.add();
     obj.mult();
    }
}
