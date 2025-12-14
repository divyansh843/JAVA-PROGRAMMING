import java.util.*;

public class binerysearsch {
    public static void binarytodecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println(" decNum of " + myNum + "=" + decNum);
    }

    public static void dectobinNum(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary from to " + myNum + "=" + binNum);
    }

    public static void main(String args[]) {
        // binarytodecimal(101);
        dectobinNum(7);
    }

}
