import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        char ch[] = {'@', '4', '8'};
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println("Hii I am divyansh");

        String s = "abc";

        String a = "abd";
        System.out.println(s.compareTo(a));



        // input in String

        Scanner sc = new Scanner(System.in);

        String name = "Hello";
        System.out.print("Enter your name : ");
        String str = sc.next();

        System.out.println("Hii" + " " + str);

        Scanner d = new Scanner(System.in);
        System.out.print("Enter your intro in one line : ");
        String intro = d.nextLine();
        System.out.println("This is your intro : " + intro);

        System.out.println(intro.length());
        System.out.println(str.charAt(4));



    }

    
}