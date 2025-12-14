import java.util.*;

public class Strings {
    public static void printletter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean ispelindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;

    }

    public static float getshortestpath(String path) {

        int X = 0;
        int Y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // nourth
            if (dir == 'N') {
                Y++;
            }
            // south
            else if (dir == 'S') {
                Y--;
            }
            // east
            else if (dir == 'E') {
                X++;
            }
            // weast
            else {
                X--;
            }
        }
        int X2 = X * X;
        int Y2 = Y * Y;
        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("abc");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String are IMMUTABLE
        // String fullname = "Divyansh sir";
        // System.out.println(fullname.length());

        // concatenetion
        // String firstname = "Divyansh";
        // String lastname = "Bahubali";
        // String fullname = firstname + " " + lastname;
        // // printletter(fullname);
        // String str = "racecar";
        // System.out.println(ispelindrome(str));
        // String path = "WNEENESENNN";
        // System.out.println(getshortestpath(path));

        String str1 = "tony";
        String str2 = "tony";
        String str3 = new String("tony");
        // if (str1 == str2) {
        // System.out.println("strings are equel");
        // } else {
        // System.out.println("strings are not equal");
        // }s

        // if (str1 == str3) {
        // System.out.println("strings are equel");
        // } else {
        // System.out.println("strings are not equal");
        // }
        if (str1.equals(str3)) {
            System.out.println("strings are equel");
        } else {
            System.out.println("strings are not equal");
        }
    }

}
