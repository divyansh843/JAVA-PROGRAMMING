import java.util.Scanner;

public class PlusOperator {

    public static void main(String[] args) {

        //Que: Take integer input and convert it into a string

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // //String str = "" + n;
        // String str = Integer.toString(n);
        String s = sc.nextLine();
        // System.out.println(str);

        //Que: Return the total number of digits in a number without using any loop.

        // System.out.println(str.length());

        //Que: change 2nd index
        s = s.substring(0, 2) + 'y' + s.substring(3);
        System.out.println(s);


        
    }
    
}
