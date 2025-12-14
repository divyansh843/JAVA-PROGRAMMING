import java.util.*;
public class Bill {
int costPerUnit = 9;
long total;
public Bill(int units) {
total = units * costPerUnit;
    }
public void disp() {
 System.out.println("Total Bill is " + total);
    }
public static void main(String[] args) {
 Bill b = new Bill(20); 
    b.disp();
    }
}
