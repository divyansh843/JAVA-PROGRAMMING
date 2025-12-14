package Fundamental;

import java.util.*;
import java.util.Scanner;


public class JavaFundamentalsTasks {

    public static int SimpleAddition(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = num.nextInt();
        System.out.print("Enter second number: ");
        int num2 = num.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }

    public static float AreaofCircle(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = r.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("The area of the circle is: " + area);
        return area;
    }

    public static int SwapNumbers(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number a : ");
        int a = num.nextInt();
        System.out.print("Enter second number b : ");
        int b = num.nextInt();
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        return 0;
    }


    public static int SumOfNaturalNumber(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = num.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        return sum;
    }

    public static void Clculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter your operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
    
        switch(operator){
            case '+' : System.out.print(a+b);
            break;
            case '-' : System.out.print(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Wrong operator ");
        }
        
    }




    public static int EvenOddCheck(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = num.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        return 0;
    }

    public static int CheckNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        return 0;
    }

    public static int LargerOfThreeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest.");
        } else {
            System.out.println(num3 + " is the largest.");
        }

        return 0;
    }



    

    public static void main(String[] args) {
        Clculator();

        
    }
}
