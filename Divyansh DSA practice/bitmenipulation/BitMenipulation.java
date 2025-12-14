import java.util.*;

public class BitMenipulation {
    public static void OddOrEven(int n) {
        int Bitmask = 1;
        if ((n & Bitmask) == 0) {
            System.out.println(" even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static int GetithBit(int n, int i) {
        int Bitmask = 1 << i;
        if ((n & Bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetithBit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;
    }

    public static int ClearithBit(int n, int i) {
        int Bitmask = ~(1 << i);
        return n & Bitmask;

    }

    public static int UpdateithBit(int n, int i, int newbit) {
        // if (newbit == 0) {
        // return ClearithBit(n, i);
        // } else {
        // return SetithBit(n, i);
        // }
        n = ClearithBit(n, i);
        int Bitmask = newbit << i;
        return n | Bitmask;

    }

    public static int ClearIBit(int n, int i) {
        int Bitmask = (~0) << i;
        return n & Bitmask;

    }

    public static int ClearIBit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int Bitmask = a | b;
        return n & Bitmask;
    }

    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int CountSetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int Fastexpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        // OddOrEven(5);
        // System.out.println(UpdateithBit(10, 2, 1));
        System.out.println(Fastexpo(3, 5));
    }
}