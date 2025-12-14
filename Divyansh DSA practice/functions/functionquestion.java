import java.util.*;

public class functionquestion {
    public static int multiply(int a, int b) {
        int product = a * b;
        System.out.println(product);
        return product;
    }

    // fectorial of n
    public static int fectorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        // System.out.println(f);

        return f;
    }

    public static int bincoeff(int n, int r) {

        int fact_n = fectorial(n);
        int fact_r = fectorial(r);
        int fact_nmr = fectorial(n - r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        System.out.println(bincoeff);
        return bincoeff;
    }

    // // function to cal 2 num
    // public static int sum(int a, int b) {
    // return a + b;

    // }

    // // function to cal 3 num
    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }
    // function to cal int sum
    public static int sum(int a, int b) {
        return a + b;

    }

    // function to cal float sum
    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    // only forn>=2
    // public static boolean isprime(int n) {
    // // corner case
    // // for2
    // if (n == 2) {
    // return true;
    // }
    // boolean isprime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // isprime = false;
    // break;
    // }
    // }
    // // System.out.println(isprime);
    // return isprime;
    // }
    public static boolean isprime(int n) {
        // corner case
        // for2
        if (n == 2) {
            return true;
        }
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        // System.out.println(isprime);
        return isprime;
    }

    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {// true
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        // multiply(4, 5);
        // fectorial(5);
        // bincoeff(5, 2);
        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.4f, 5.2f, 6.1f));
        // System.out.println(isprime(2));
        // isprime(5);
        primeinrange(20);
    }

}
