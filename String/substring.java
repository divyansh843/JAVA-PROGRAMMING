import java.util.*;

public class substring {
    public static String SubString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    public static String Compress(String str) {
        String newstr = "";
        // aabbbcccdddd
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String args[]) {
        // String str = "Hello World";
        // System.out.println(str.substring(0, 5));
        // System.out.println(SubString(str, 0, 5));
        // String fruits[] = { "apple", "mango", "banana" };

        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("");

        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // } // abcdef
        // System.out.println(sb.length());

        // String str = "hii i am divyansh bahubali";
        String str = "aaaabbcccddd";
        // System.out.println(toUpperCase(str));
        System.out.println(Compress(str));
    }

}
