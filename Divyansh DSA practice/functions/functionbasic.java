import java.util.*;

public class functionbasic {
    public static void printhellowworld() {
        System.out.println("hellow world");
        System.out.println("hellow world");
        System.out.println("hellow world");

    }

    // public static void calculatesum(int num1, int num2) {
    // int sum = num1 + num2;
    // System.out.println( "our sum is : " + sum);
    // }
    public static int calculatesum(int num1, int num2) { // parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);

    }

    public static void main(String args[]) {
        // printhellowworld(); //function cell
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculatesum(a, b); // arguments or actual parameter
        // System.out.println("our sum is : " + sum);
        int a = 7;
        int b = 3;
        swap(a, b);

    }

}
